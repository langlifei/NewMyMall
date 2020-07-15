package com.mall.mallcache.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Author Zeng Zhuo
 * @Date 2020/7/15 15:29
 * @Describe
 */

@Service
public class RedisService {
    @Autowired
    JedisPool jedisPool;

    public <T> T get(KeyPrefix keyPrefix ,String key, Class<T> clazz){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            //拼接Key
            String realKey = keyPrefix.getPrefix()+key;
            String str = jedis.get(realKey);
            //将String转换为Bean对象
            T t = stringToBean(str,clazz);
            return t;
        }finally {
            returnToResource(jedis);
        }
    }

    public <T> boolean set(KeyPrefix keyPrefix ,String key, T value){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String str = beanToString(value);
            if(str==null||str.length()<=0)
                return false;
            //拼接Key
            String realKey = keyPrefix.getPrefix()+key;

            int expireSeconds = keyPrefix.expireSeconds();
            if(expireSeconds<=0)
                jedis.set(realKey,str);
            else
                jedis.setex(realKey,expireSeconds,str);
            //将Bean对象转换为String
            return true;
        }finally {
            returnToResource(jedis);
        }
    }

    public <T> String beanToString(T value) {
        if(value == null)
            return null;
        Class<?> clazz = value.getClass();
        if(clazz == Integer.class||clazz==int.class||clazz==long.class||clazz==Integer.class)
            return ""+value;
        else if(clazz==String.class)
            return (String)value;
        else
            return JSONObject.toJSONString(value);
    }

    private void returnToResource(Jedis jedis) {
        //将资源返回给连接池
        if(jedis!=null){
            jedis.close();
        }
    }

    public <T> T stringToBean(String str, Class<T> clazz) {
        //公开方法首先进行参数校验
        if(str == null || str.length()<=0 || clazz == null)
            return null;
        else if(clazz == Integer.class||clazz==int.class)
            return (T) Integer.valueOf(str);
        else if(clazz == String.class)
            return (T) str;
        else if(clazz==long.class||clazz==Integer.class)
            return (T)Long.valueOf(str);
        else
            return (T) JSON.toJavaObject(JSON.parseObject(str),clazz);
    }

    public <T> boolean exits(KeyPrefix keyPrefix , String key){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String realKey = keyPrefix.getPrefix()+key;
            if(jedis.exists(realKey))
                return true;
            else
                return false;
        }finally {
            returnToResource(jedis);
        }
    }

    public <T> Long setNX(KeyPrefix keyPrefix,String key,T value){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String realKey = keyPrefix.getPrefix() + key;
            String str = beanToString(value);
            if (str == null || str.length() <= 0)
                return (long) 0;
            Long flag = jedis.setnx(realKey, str);
            //由于操作不是原子性的，可能会出现执行了setNX，但未执行expire的情况，
            // 从而导致其值一直留在redis中(后期解决这个问题)。
            int expireSeconds = keyPrefix.expireSeconds();
            if (expireSeconds > 0)
                jedis.expire(realKey, expireSeconds);
            return flag;
        }finally {
            returnToResource(jedis);
        }

    }

    public <T> boolean delete(KeyPrefix keyPrefix ,String key){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String realKey = keyPrefix.getPrefix()+key;
            Long del = jedis.del(realKey);
            return del>0;
        }finally {
            //由于使用池化技术，使用完需要释放连接资源，否则很快会被耗空
            returnToResource(jedis);
        }
    }

    public <T> Long incr(KeyPrefix keyPrefix,String key){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String realKey = keyPrefix.getPrefix()+key;
            Long incr = jedis.incr(realKey);
            return incr;
        }finally {
            returnToResource(jedis);
        }
    }

    public <T> Long decr(KeyPrefix keyPrefix,String key){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String realKey = keyPrefix.getPrefix()+key;
            Long incr = jedis.decr(realKey);
            return incr;
        }finally {
            returnToResource(jedis);
        }
    }
}

package com.mall.mallcache.redis;

/**
 * @Author Zeng Zhuo
 * @Date 2020/7/15 16:08
 * @Describe
 */

public interface KeyPrefix {

    String getPrefix();
    int expireSeconds();
}

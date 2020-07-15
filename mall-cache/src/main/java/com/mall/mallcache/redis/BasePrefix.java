package com.mall.mallcache.redis;

/**
 * @Author Zeng Zhuo
 * @Date 2020/7/15 16:11
 * @Describe
 */

public abstract class BasePrefix implements KeyPrefix {

    private String prefix;
    private int expireSeconds;

    public BasePrefix(String prefix) {
        this(prefix,0);
    }

    public BasePrefix(String prefix, int expireSeconds) {
        this.prefix = prefix;
        this.expireSeconds = expireSeconds;
    }

    @Override
    public String getPrefix() {
        return this.getClass().getSimpleName()+":"+prefix+":";
    }

    @Override
    public int expireSeconds() {
        return this.expireSeconds;
    }
}

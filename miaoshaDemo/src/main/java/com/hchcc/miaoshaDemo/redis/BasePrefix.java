package com.hchcc.miaoshaDemo.redis;

public abstract class BasePrefix implements KeyPrefix{
    private String prefix;
    private int expireTime;
    BasePrefix(String prefix){
        this.prefix = prefix;
        expireTime = 0;
    }
    BasePrefix(String prefix,int expireTime){
        this.prefix = prefix;
        this.expireTime = expireTime;
    }

    @Override
    public String getPrefix() {
        return  this.getClass().getSimpleName() + ":" + prefix;
    }

    @Override
    public int getExpireTime() {
        return expireTime;
    }
}

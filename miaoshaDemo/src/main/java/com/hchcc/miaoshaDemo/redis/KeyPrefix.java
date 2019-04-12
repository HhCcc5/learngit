package com.hchcc.miaoshaDemo.redis;

public interface KeyPrefix {
    int getExpireTime();
    String getPrefix();
}

package com.hchcc.miaoshaDemo.redis;

public class OrderKey extends BasePrefix{
    OrderKey(String prefix,int expireTime){
        super(prefix,expireTime);
    }
}

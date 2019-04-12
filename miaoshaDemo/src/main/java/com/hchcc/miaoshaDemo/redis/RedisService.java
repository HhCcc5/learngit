package com.hchcc.miaoshaDemo.redis;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class RedisService {
    @Autowired
    JedisPool redisPool;

    //set
    public <T> boolean set(KeyPrefix prefix,String key, T value){
        Jedis jedis = redisPool.getResource();
        try{
            String finalKey = prefix.getPrefix()+key;
            String finalValue = beanToString(value);
            int expireTime = prefix.getExpireTime();
            if(expireTime<=0){
                jedis.set(finalKey,finalValue);
            }else{
                jedis.setex(finalKey,expireTime,finalValue);
            }
            return true;
        }finally {
            stopJedisPool(jedis);
        }



    }

    //get
    public <T> T get(KeyPrefix prefix,String key,Class<?> clazz) {
        Jedis jedis = redisPool.getResource();
        try {
            String finalKey = prefix.getPrefix()+key;
            String finalValue = jedis.get(finalKey);
            return stringToBean(finalValue, clazz);
        }
        finally {
            stopJedisPool(jedis);
        }

    }

    private <T> String beanToString(T value) {
        Class<?> clazz = value.getClass();
        if(clazz==int.class){
            return ""+value;
        }else if(clazz==String.class){
            return value.toString();
        }else{
            return JSONObject.toJSONString(value);
        }
    }

    private <T> T stringToBean(String value,Class<?> clazz) {
        if(clazz==int.class){
            return (T)Integer.valueOf(value);
        }else if(clazz==String.class){
            return (T)value;
        }else{
            return (T)JSONObject.parse(value);
        }
    }
    private void stopJedisPool(Jedis jedis) {
        if(jedis!=null){
            jedis.close();
        }
    }
}

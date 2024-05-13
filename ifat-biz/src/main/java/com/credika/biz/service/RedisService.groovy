package com.credika.biz.service

class RedisService extends com.credika.biz.api.RedisAPI {

    static Object get(String key){
        Object value = meijiRedis.get(key)
        return value
    }

    static Long ttl(String key){
        Long value = meijiRedis.ttl(key)
        return value
    }


}

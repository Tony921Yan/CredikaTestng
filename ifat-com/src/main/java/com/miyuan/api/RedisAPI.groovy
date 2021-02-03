package com.miyuan.api

import com.miyuan.factory.FactorySupport
import redis.clients.jedis.JedisCluster

class RedisAPI {
    static JedisCluster jedisCluster = FactorySupport.createRedis("redis-miyuan")

    static JedisCluster jedisClusterIfatTest = FactorySupport.createRedis("redis-ifatTest")

}

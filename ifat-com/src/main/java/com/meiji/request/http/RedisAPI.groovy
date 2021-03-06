package com.meiji.request.http

import com.meiji.factory.FactorySupport
import redis.clients.jedis.JedisCluster

class RedisAPI {
    static JedisCluster jedisCluster = FactorySupport.createRedis("redis-miyuan")

    static JedisCluster jedisClusterIfatTest = FactorySupport.createRedis("redis-ifatTest")

}

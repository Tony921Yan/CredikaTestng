package com.meiji.biz.api

import com.miyuan.ifat.support.factory.FactorySupport
import redis.clients.jedis.JedisCluster

class RedisAPI {
    static JedisCluster jedisCluster = FactorySupport.createRedis("redis-miyuan")

    static JedisCluster jedisClusterIfatTest = FactorySupport.createRedis("redis-ifatTest")

}

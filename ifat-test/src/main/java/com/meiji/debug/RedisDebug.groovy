package com.meiji.debug


import com.miyuan.service.RedisService
import com.miyuan.util.JsonUtil
import org.testng.annotations.Test

class RedisDebug {
    @Test
    void test(){
        Object o = RedisService.get("23177620")
        println(o)

        Object o1 = RedisService.getcommis("str:simple-com:20210127:11167015")
        println("commssion---"+o1)
        Object o2 = RedisService.getcommis("str:type-com:20210127:11167015:1")
        println("commssion2---"+o2)
    }

    @Test
    void test2(){
        String redisTypeComkey = "str:type-com:20210202:11167015:1"
        String typeCom= RedisService.getcommis(redisTypeComkey)
        println(typeCom)
        String typeCom1= "{\"type\":\"1\"}"
        println(typeCom1)
        def typeComJson = JsonUtil.strJsonToJson(typeCom)
        println(typeComJson)
        println(typeComJson.type)
        def typeComJson1 = JsonUtil.strToJson(typeCom1)
        println(typeComJson1)
        println(typeComJson1.type)
        //println(typeComJson.type)
    }

    @Test
    void test3(){
        String redisTypeComkey = "str:type-com:20210202:11167015:1"
        String typeCom= "{\"type\":\"1\"}"
        def typeComJson = JsonUtil.strToJson(typeCom)
        println(typeComJson)
        println(typeComJson.type)
    }
}

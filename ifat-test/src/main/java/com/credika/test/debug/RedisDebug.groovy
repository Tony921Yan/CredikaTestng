package com.credika.test.debug

import com.credika.biz.service.RedisService
import org.testng.annotations.Test

class RedisDebug {

    @Test
    void test(){
        Object o = RedisService.get("str:shop:module-list:1425283668246560")
        println(o)
        Long t = RedisService.ttl("str:shop:module-list:1425283668246560")
        println(t)
    }


}

package com.credika.test.debug

import com.credika.biz.service.EsService
import org.testng.annotations.Test

class EsDebug {
    @Test
    void test1(){
        List list = EsService.getItemByitemSourceId("630407291117")
        println(list)
    }

    @Test
    void test2(){
        List list = EsService.getItemByitemTitle("衣服")
        println(list)
    }
}

package com.miyuan.debug

import com.miyuan.service.MongoService
import com.miyuan.util.DateUtil
import org.testng.annotations.Test


class MongoDebug {
    @Test
    void test(){
       List list = MongoService.getUserOderByUserId(23177620)
        println(list)
    }

    @Test
    void test2(){
        List list = MongoService.getUserOderByOrderId("790803265557212687")
        println(list)
    }

    @Test
    void test3(){
      //  List list = MongoService.getSumOrder(22038202,"TB",1, DateUtil.strToDate("2020-11-10 00:00:00"),DateUtil.strToDate("2020-12-11 00:00:00"))
    }
}

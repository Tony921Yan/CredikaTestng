package com.credika.test.debug

import com.credika.biz.service.MysqlService
import org.testng.annotations.Test

class MysqlDebug {
    @Test
    void test(){
        List list = MysqlService.getUserInfo("23177620")
        println(list)
    }

}

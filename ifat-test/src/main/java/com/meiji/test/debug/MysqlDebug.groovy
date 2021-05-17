package com.meiji.test.debug

import org.testng.annotations.Test

class MysqlDebug {
    @Test
    void test(){
        List list = MysqlService.getUserInfo(23177620)
        println(list)
    }

}

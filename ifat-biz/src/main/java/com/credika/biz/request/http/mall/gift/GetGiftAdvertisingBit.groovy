package com.credika.biz.request.http.mall.gift

import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class GetGiftAdvertisingBit extends MallPost {
    {
        super.api = "gift/getGiftAdvertisingBit"
        super.params =  ["location"]
    }

    GetGiftAdvertisingBit invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGiftAdvertisingBit baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetGiftAdvertisingBit specialAssert(TestContext testContext){
        def apiResult = testContext.getResponse().data
        ArrayList mysqlResult = MysqlService.giftAdvManageLocation(testContext.get("location"))
        println "mysqlResult:"+ mysqlResult
        println "apiResult:" + apiResult
        if(apiResult != null && mysqlResult !=null){
            for(int i =0;i<mysqlResult.size();i++){
                println mysqlResult.get(i)
                println apiResult.get(i)
            }

            }
        }
}

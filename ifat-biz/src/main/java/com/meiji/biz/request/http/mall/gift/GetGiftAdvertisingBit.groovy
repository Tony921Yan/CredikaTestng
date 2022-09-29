package com.meiji.biz.request.http.mall.gift

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
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
        println apiResult
        println apiResult.getClass()

        ArrayList mysqlResult = MysqlService.giftAdvManageLocation(testContext.get("location"))
        println mysqlResult
    }

}

package com.credika.biz.request.http.platform.raffleActivity


import com.miyuan.ifat.support.test.TestContext

class StockIncrBy extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="LuckyManage/stockIncrBy"
        super.params = ["incrBy","itemId","operateType","refId"]
    }

    StockIncrBy invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    StockIncrBy preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    StockIncrBy baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        return this
    }
}
package com.meiji.biz.request.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class StockDecrBy extends PlatformPost{
    {
        super.api="LuckyManage/stockDecrBy"
        super.params = ["decrBy","itemId","operateType","refId"]
    }

    StockDecrBy invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    StockDecrBy preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    StockDecrBy baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        return this
    }
}
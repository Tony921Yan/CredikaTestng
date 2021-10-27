package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class StockManage extends PlatformPost {
    {
        super.api = "StockManage/pageQueryAllotBill"
        super.params =  [ "pageNum","pageSize"]
    }

    StockManage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    StockManage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    StockManage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    StockManage specicalAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}

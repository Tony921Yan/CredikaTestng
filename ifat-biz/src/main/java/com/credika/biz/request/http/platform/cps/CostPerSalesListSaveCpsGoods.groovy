package com.credika.biz.request.http.platform.cps

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CostPerSalesListSaveCpsGoods extends PlatformPost {
    {
        super.api = "/CostPerSalesList/saveCpsGoods"
        super.params =  ["cpsCategoryId","goods"]
    }

    CostPerSalesListSaveCpsGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CostPerSalesListSaveCpsGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CostPerSalesListSaveCpsGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

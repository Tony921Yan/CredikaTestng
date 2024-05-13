package com.credika.biz.request.http.platform.cps

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CostPerSalesListChangeCpsGoodsCategory extends PlatformPost {
    {
        super.api = "/CostPerSalesList/changeCpsGoodsCategory"
        super.params =  ["cpsCategoryId","ids"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

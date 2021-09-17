package com.meiji.biz.request.http.mall.orderAfterSale

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetComCode extends MallPost {
    {
        super.api = "/orderAfterSale/getComCode"
        super.params =  ["logisticsCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallPost invoke(TestContext testContext) {N        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}

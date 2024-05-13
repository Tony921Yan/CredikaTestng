package com.credika.biz.request.http.mall.orderAfterSale

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetComCode extends MallPost {
    {
        super.api = "/orderAfterSale/getComCode"
        super.params =  ["logisticsCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetComCode invoke(TestContext testContext) {N        super.invoke(testContext)
        return this
    }

    GetComCode preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetComCode baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

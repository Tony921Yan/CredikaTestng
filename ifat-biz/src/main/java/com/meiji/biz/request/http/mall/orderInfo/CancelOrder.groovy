package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class CancelOrder extends MallPost {
    {
        super.api = "/orderInfo/CancelOrder"
        super.params =  ["orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    CancelOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CancelOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CancelOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

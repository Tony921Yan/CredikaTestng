package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class PayOrder extends MallPost {
    {
        super.api = "/orderInfo/payOrder"
        super.params =  ["appId","openId","orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    PayOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PayOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PayOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

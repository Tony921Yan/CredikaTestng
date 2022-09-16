package com.meiji.biz.request.http.mall.coupon

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SubscribeNotice extends MallPost{
    {
        super.api = "coupon/subscribeNotice"
       super.params = ["userId","shopId"]
    }

    SubscribeNotice invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SubscribeNotice preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SubscribeNotice baseAssert(TestContext testContext){
        // assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}

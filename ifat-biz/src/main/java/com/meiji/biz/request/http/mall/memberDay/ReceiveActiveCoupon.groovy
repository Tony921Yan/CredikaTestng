package com.meiji.biz.request.http.mall.memberDay
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ReceiveActiveCoupon extends MallPost {
    {
        super.api = "active/receiveActiveCoupon"
        super.params =  ["activeId"]
    }

    ReceiveActiveCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ReceiveActiveCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ReceiveActiveCoupon baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

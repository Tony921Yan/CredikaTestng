package com.credika.biz.request.http.mall.integral
import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class IntegralConvert extends MallPost {
    {
        super.api = "integral/integralConvert"
        super.params = ["activeId", "couponId", "couponName", "integral", "shopId"]
    }

    IntegralConvert invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    IntegralConvert baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        return this
    }
}
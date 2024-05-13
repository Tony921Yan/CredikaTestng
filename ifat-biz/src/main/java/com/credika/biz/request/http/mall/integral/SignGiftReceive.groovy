package com.credika.biz.request.http.mall.integral
import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SignGiftReceive extends MallPost{
    {
        super.api = "integral/signGiftReceive"
        super.params=["userId","receiveCouponShopId"]
    }

    SignGiftReceive invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    SignGiftReceive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

package com.credika.biz.request.http.mall.newVip

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ReceiveNewVipActiveCoupon extends MallPost{
    {
        super.api = "newVip/receiveNewVipActiveCoupon"
       super.params = [ "activeId","couponId"]
    }

    ReceiveNewVipActiveCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ReceiveNewVipActiveCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ReceiveNewVipActiveCoupon baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        //super.baseAssert(testContext)
        return this
    }


}

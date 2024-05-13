package com.credika.biz.request.http.platform.couponManage


import com.miyuan.ifat.support.test.TestContext

class GetGrantCouponActiveByPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CouponManage/getGrantCouponActiveByPage"
       super.params = ["couponId","activeId","couponName","gmtCreateEnd","gmtCreateStart","name","page","rows","type"]
    }

    GetGrantCouponActiveByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGrantCouponActiveByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGrantCouponActiveByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}

package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class AdditionalBonds extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "activeMainManage/additionalBonds"
       super.params = ["activeId","coupons"]
    }

    AdditionalBonds invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AdditionalBonds preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AdditionalBonds baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        return this
    }


}

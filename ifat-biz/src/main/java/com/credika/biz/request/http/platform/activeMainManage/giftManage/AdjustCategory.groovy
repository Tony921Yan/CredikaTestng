package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class AdjustCategory extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftManage/adjustCategory"
        super.params = ["id","action"]
    }

    AdjustCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AdjustCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AdjustCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class AdjustCombination extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftManage/adjustCombination"
        super.params = ["id","action"]
    }

    AdjustCombination invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AdjustCombination preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AdjustCombination baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

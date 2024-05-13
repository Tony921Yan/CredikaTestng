package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class CheckGiftSwitch extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ActiveMainManage/checkGiftSwitch"
        super.params = ["action","spuId"]
    }

    CheckGiftSwitch invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CheckGiftSwitch preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CheckGiftSwitch baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}

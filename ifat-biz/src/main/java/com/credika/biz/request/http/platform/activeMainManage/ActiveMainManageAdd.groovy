package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class ActiveMainManageAdd extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ActiveMainManage/add"
       super.params = ["expiryEnd","expiryStart","name","preTime","title","secKillActivity","status","type","activeCoupons","couponActivityExt","limitNum","changeNewFansFlag","personProperty","personScope","remark","times"]
    }

    ActiveMainManageAdd invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ActiveMainManageAdd preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ActiveMainManageAdd baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}

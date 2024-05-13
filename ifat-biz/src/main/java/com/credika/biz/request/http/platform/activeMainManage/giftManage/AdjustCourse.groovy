package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class AdjustCourse extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftManage/adjustCourse"
        super.params = ["id","action"]
    }

    AdjustCourse invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AdjustCourse preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AdjustCourse baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

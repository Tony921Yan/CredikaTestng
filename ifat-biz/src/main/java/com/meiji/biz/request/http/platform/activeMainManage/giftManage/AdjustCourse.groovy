package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AdjustCourse extends PlatformPost{
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

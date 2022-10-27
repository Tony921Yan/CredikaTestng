package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddCourse extends PlatformPost{
    {
        super.api = "GiftManage/addCourse"
        super.params = ["name","status","pic","sort","remark","page","type","urlList"]
    }
    AddCourse invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddCourse preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddCourse baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

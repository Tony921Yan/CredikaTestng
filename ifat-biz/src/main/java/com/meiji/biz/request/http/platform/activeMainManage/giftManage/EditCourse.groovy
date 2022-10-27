package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class EditCourse extends PlatformPost{
    {
        super.api = "GiftManage/editCourse"
        super.params = ["id","name","status","pic","sort","remark","page","type","urlList"]
    }

    EditCourse invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    EditCourse preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    EditCourse baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

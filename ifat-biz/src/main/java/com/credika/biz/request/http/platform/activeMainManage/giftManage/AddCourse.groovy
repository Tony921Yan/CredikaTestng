package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class AddCourse extends com.credika.biz.request.http.platform.PlatformPost{
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

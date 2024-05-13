package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class AddCategory extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftManage/addCategory"
        super.params = ["name","status","pic","sort","remark","labelIds","spuIdList"]
    }
    AddCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

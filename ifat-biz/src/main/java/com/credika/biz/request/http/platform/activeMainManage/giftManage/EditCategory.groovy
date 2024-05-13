package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class EditCategory extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftManage/editCategory"
        super.params = ["id","name","status","pic","sort","remark","labelIds","spuIdList"]
    }

    EditCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    EditCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    EditCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class UpdateLabelTree extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftManage/updateLabelTree"
        super.params = ["id","name","status","sort","parentId","parentName"]
    }

    UpdateLabelTree invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateLabelTree preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateLabelTree baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

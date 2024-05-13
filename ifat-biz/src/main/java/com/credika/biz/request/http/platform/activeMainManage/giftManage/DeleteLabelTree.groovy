package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class DeleteLabelTree extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftManage/deleteLabelTree"
        super.params = ["list"]
    }

    DeleteLabelTree invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteLabelTree preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteLabelTree baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

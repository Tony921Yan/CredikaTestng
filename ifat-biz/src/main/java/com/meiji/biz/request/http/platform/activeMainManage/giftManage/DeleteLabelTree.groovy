package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeleteLabelTree extends PlatformPost{
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

package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateLabelTree extends PlatformPost{
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

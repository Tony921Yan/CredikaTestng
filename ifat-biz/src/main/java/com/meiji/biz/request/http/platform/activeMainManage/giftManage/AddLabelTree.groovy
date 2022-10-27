package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddLabelTree extends PlatformPost{
    {
        super.api = "GiftManage/addLabelTree"
        super.params = ["name","status","sort","parentId"]
    }

    AddLabelTree invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddLabelTree preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddLabelTree baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

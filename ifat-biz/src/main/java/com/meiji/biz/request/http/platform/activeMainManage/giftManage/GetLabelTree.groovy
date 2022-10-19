package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetLabelTree extends PlatformPost{
    {
        super.api = "GiftManage/getLabelTree"
        super.params = []
    }

    GetLabelTree invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetLabelTree preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetLabelTree baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}

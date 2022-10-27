package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetCombinationList extends PlatformPost{
    {
        super.api = "GiftManage/getCombinationList"
        super.params = ["condition","page","rows"]
    }

    GetCombinationList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCombinationList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCombinationList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

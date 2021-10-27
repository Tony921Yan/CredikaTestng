package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetCardDetail extends PlatformPost{
    {
        super.api="Channel/getCardDetail"
        super.params = ["channelName"]
    }

    GetCardDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCardDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCardDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetChannelCostList extends PlatformPost{
    {
        super.api="Channel/getChannelCostList"
        super.params = ["condition","page","rows"]
    }

    GetChannelCostList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetChannelCostList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetChannelCostList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

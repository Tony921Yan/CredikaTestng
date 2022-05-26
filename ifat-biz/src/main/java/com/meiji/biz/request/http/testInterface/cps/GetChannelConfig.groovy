package com.meiji.biz.request.http.testInterface.cps

import com.miyuan.ifat.support.test.TestContext

class GetChannelConfig extends CpsPost {
    {
        super.api = "thirdparty/api/cps/getChannelConfig"
        super.params =  ["templateId"]
    }

    GetChannelConfig invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetChannelConfig preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetChannelConfig baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

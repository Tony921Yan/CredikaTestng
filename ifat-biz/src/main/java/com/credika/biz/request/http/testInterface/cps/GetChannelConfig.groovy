package com.credika.biz.request.http.testInterface.cps

import com.miyuan.ifat.support.test.TestContext

class GetChannelConfig extends CpsPost {
    {
        Object.api = "thirdparty/api/cps/getChannelConfig"
        Object.params =  ["templateId"]
    }

    GetChannelConfig invoke(TestContext testContext) {
        Object.invoke(testContext)
        return this
    }

    GetChannelConfig preInvoke(TestContext testContext){
        Object.preInvoke(testContext)
        return this
    }

    GetChannelConfig baseAssert(TestContext testContext){
        Object.baseAssert(testContext)
        return this
    }

}

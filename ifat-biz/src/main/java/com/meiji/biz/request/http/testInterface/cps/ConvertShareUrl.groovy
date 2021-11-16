package com.meiji.biz.request.http.testInterface.cps

import com.miyuan.ifat.support.test.TestContext

class ConvertShareUrl extends CpsPost {
    {
        super.api = "thirdparty/api/cps/convertShareUrl"
        super.params =  ["shareUrl"]
    }

    ConvertShareUrl invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ConvertShareUrl preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ConvertShareUrl baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

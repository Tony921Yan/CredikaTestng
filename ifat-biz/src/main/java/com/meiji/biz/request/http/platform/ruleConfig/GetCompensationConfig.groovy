package com.meiji.biz.request.http.platform.ruleConfig

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetCompensationConfig extends PlatformPost{
    {
        super.api = "RuleConfig/getCompensationConfig"
       super.params = [ ]
    }

    GetCompensationConfig invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCompensationConfig preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCompensationConfig baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}

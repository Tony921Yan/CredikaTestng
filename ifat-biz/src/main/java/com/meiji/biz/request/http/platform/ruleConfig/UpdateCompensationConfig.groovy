package com.meiji.biz.request.http.platform.ruleConfig

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateCompensationConfig extends PlatformPost{
    {
        super.api = "RuleConfig/updateCompensationConfig"
       super.params = [ "days","mainPics","propDetailPics","propPics","rules","uploadRules"]
    }

    UpdateCompensationConfig invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateCompensationConfig preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateCompensationConfig baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}

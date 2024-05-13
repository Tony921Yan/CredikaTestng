package com.credika.biz.request.http.platform.ruleConfig


import com.miyuan.ifat.support.test.TestContext

class UpdateCompensationConfig extends com.credika.biz.request.http.platform.PlatformPost{
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

package com.meiji.biz.request.http.platform.applicationList

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetCompensationDetail extends PlatformPost {
    {
        super.api = "ApplicationList/getCompensationDetail"
        super.params =  [ "id"]
    }

    GetCompensationDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCompensationDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCompensationDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }


}

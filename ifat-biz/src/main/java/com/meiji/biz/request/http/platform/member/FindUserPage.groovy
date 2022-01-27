package com.meiji.biz.request.http.platform.member

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FindUserPage extends PlatformPost{
    {
        super.api="/Memeber/findUserPage"
        super.params = ["condition","sourceType","page","rows"]
    }

    FindUserPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUserPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindUserPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    FindUserPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResul"+apiResult.total)
        assert apiResult.total >20
        return this
    }

}

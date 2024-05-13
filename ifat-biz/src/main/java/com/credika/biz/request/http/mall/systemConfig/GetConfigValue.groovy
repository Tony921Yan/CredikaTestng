package com.credika.biz.request.http.mall.systemConfig

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetConfigValue extends MallPost{
    {
        super.api = "systemConfig/getConfigValue"
       super.params = [ "key"]
    }

    GetConfigValue invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetConfigValue preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetConfigValue baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}

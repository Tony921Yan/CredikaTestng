package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CustomerServiceManage extends PlatformPost {
    {
        super.api = "CustomerServiceManage/searchByCondition"
        super.params =  [ "status","page","rows"]
    }

    CustomerServiceManage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CustomerServiceManage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CustomerServiceManage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    CustomerServiceManage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 1
        return this
    }
}

package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class    CustomerServiceManageSearchByCondition extends PlatformPost {
    {
        super.api = "CustomerServiceManage/searchByCondition"
        super.params =  ["status","page","rows"]
    }

    CustomerServiceManageSearchByCondition invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CustomerServiceManageSearchByCondition preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CustomerServiceManageSearchByCondition baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PlatformPost specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        assert apiResult.total > 20
        return this
    }

}

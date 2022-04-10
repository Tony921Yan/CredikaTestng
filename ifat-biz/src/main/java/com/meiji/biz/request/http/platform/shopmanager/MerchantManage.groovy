package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class MerchantManage extends PlatformPost {
    {
        super.api = "MerchantManage/findDealerPage"
        super.params =  [ "page","rows"]
    }

    MerchantManage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MerchantManage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MerchantManage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    MerchantManage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}

package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class MerchantManage extends com.credika.biz.request.http.platform.PlatformPost {
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

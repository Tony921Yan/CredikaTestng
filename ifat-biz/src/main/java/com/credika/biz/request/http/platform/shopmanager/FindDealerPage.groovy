package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class FindDealerPage extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "MerchantManage/findDealerPage"
        super.params =  [ "createTimeEnd","createTimeStart","dealerCode","nickname","page","phone","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindDealerPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindDealerPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindDealerPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

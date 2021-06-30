package com.meiji.biz.request.http.shop

import com.miyuan.ifat.support.test.TestContext

class Asset extends ShopGet {
    {
        super.api = "/shop/profitSharing/asset"
        super.params =  ["shopId"]
    }

    ShopGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
//
//    MeijiGet dateAssert(TestContext testContext){
//        List mysqlData = MysqlService.get
//    }
}

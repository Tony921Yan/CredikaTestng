package com.meiji.biz.request.http.shop

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiGet

class Asset extends MeijiGet {
    {
        super.api = "/shop/profitSharing/asset"
        super.params =  ["shopId","userId"]
    }

    MeijiGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
//
//    MeijiGet dateAssert(TestContext testContext){
//        List mysqlData = MysqlService.get
//    }
}

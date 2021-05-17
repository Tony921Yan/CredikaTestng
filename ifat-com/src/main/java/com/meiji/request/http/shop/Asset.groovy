package com.meiji.request.http.shop

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiGet
import com.meiji.service.MysqlService

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

package com.meiji.request.http.orderafter

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class ExportOrderAfter extends MeijiRequest {
    {
        super.api = "/platform/orderMgr/exportOrderAfter"
        super.params =  [ "condition.afterStatus","condition.gmtCreatEndDate","condition.gmtCreateStrDate",
                          "condition.orderAfterCode","order","page","rows","sort"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}

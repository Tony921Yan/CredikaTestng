package com.meiji.biz.request.http.platform.orderafter

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ExportOrderAfter extends PlatformPost {
    {
        super.api = "/platform/orderMgr/exportOrderAfter"
        super.params =  [ "condition.afterStatus","condition.gmtCreatEndDate","condition.gmtCreateStrDate",
                          "condition.orderAfterCode","order","page","rows","sort"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ExportOrderAfter invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ExportOrderAfter preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ExportOrderAfter baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

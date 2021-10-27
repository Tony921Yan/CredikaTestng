package com.meiji.biz.request.http.OMS.excel

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetTaskByPage extends OMSPost {
    {
        super.api = "/api/supplier/excelMgr/getTaskByPage"
        super.params =  [ "condition","order","page","rows","sort"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetTaskByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetTaskByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetTaskByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

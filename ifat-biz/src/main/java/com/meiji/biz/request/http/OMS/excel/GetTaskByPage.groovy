package com.meiji.biz.request.http.OMS.excel


import com.miyuan.ifat.support.test.TestContext

class GetTaskByPage extends OMSPost {
    {
        super.api = "/api/supplier/excelMgr/getTaskByPage"
        super.params =  [ "condition","order","page","rows","sort"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    OMSPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OMSPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OMSPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}

package com.meiji.biz.request.http.OMS.order

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetTaskByPage extends OMSPost {
    {
        super.api = "/OrderDetailManage/getTaskByPage"
        super.params =  [ "page","rows","condition","supplierId","name"]

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

package com.credika.biz.request.http.platform.workOrder


import com.miyuan.ifat.support.test.TestContext

class UpdateOrderIssue extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/WorkOrder/updateOrderIssue"
        super.params = ["addition","id","resultRemark","status"]
    }

    UpdateOrderIssue invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateOrderIssue preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateOrderIssue baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

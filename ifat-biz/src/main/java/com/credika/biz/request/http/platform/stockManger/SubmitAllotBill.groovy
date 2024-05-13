package com.credika.biz.request.http.platform.stockManger


import com.miyuan.ifat.support.test.TestContext
class SubmitAllotBill extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="StockManage/submitAllotBill"
        super.params = ["adjustId"]
    }

    SubmitAllotBill invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SubmitAllotBill preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SubmitAllotBill baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

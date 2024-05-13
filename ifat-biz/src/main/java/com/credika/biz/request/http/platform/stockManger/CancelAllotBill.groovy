package com.credika.biz.request.http.platform.stockManger


import com.miyuan.ifat.support.test.TestContext

class CancelAllotBill extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="StockManage/cancelAllotBill"
        super.params = ["adjustId"]
    }

    CancelAllotBill invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CancelAllotBill preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CancelAllotBill baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

package com.credika.biz.request.http.mall.orderInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ConfirmReceipt extends MallPost {
    {
        super.api = "/orderInfo/ConfirmReceipt"
        super.params =  ["orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ConfirmReceipt invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ConfirmReceipt preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ConfirmReceipt baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

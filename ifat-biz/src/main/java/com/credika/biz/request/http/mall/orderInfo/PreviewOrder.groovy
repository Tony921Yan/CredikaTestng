package com.credika.biz.request.http.mall.orderInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.credika.biz.service.MysqlService

class PreviewOrder extends MallPost {
    {
        super.api = "/orderInfo/previewOrder"
        super.params =  ["addressId","orderGoods","shopId","orderType","raffleRecordId","deliveryDays","subscribeConfig"]
    }

    PreviewOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PreviewOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PreviewOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PreviewOrder specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.previewOrder(testContext.get("shopId")).get(0)
        return this
    }
}

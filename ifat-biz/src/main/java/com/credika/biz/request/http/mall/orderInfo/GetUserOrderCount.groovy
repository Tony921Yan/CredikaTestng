package com.credika.biz.request.http.mall.orderInfo

import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class GetUserOrderCount extends MallPost {
    {
        super.api = "/orderInfo/getUserOrderCount"
        super.params =  ["shopId"]
    }

    GetUserOrderCount invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetUserOrderCount preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetUserOrderCount baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetUserOrderCount specialAssert(TestContext testContext){
        Map toAfterCount = MysqlService.getUserOrderCount_toAfterCount(testContext.get("shopId")).get(0)
        System.out.println(toAfterCount)
        Map  toConfirmCount = MysqlService.getUserOrderCount_toConfirmCount(testContext.get("shopId")).get(0)
        Map toDeliveryCount = MysqlService.getUserOrderCount_toDeliveryCount(testContext.get("shopId")).get(0)
        Map toPayCount = MysqlService.getUserOrderCount_toPayCount(testContext.get("shopId")).get(0)
        Map apiResult = testContext.getResponse().data
        System.out.println(apiResult)
        assert toAfterCount.AfterCount == apiResult.toAfterCount
        assert toConfirmCount.confirmCount == apiResult.toConfirmCount
        assert toDeliveryCount.DeliveryCount == apiResult.toDeliveryCount
        assert toPayCount.PayCount == apiResult.toPayCount
        return this
    }
}

package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class GetUserOrderCount extends MallPost {
    {
        super.api = "/orderInfo/getUserOrderCount"
        super.params =  ["shopId"]
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MallPost specialAssert(TestContext testContext){
        Map toAfterCount = MysqlService.getUserOrderCount_toAfterCount(testContext.get("shopId")).get(0)
        Map  toConfirmCount = MysqlService.getUserOrderCount_toConfirmCount(testContext.get("shopId")).get(0)
        Map toDeliveryCount = MysqlService.getUserOrderCount_toDeliveryCount(testContext.get("shopId")).get(0)
        Map toPayCount = MysqlService.getUserOrderCount_toPayCount(testContext.get("shopId")).get(0)
        Map apiResult = testContext.getResponse().data
        assert toAfterCount.AfterCount == apiResult.toAfterCount
        assert toConfirmCount.confirmCount == apiResult.toConfirmCount
        assert toDeliveryCount.DeliveryCount == apiResult.toDeliveryCount
        assert toPayCount.PayCount == apiResult.toPayCount
    }
}

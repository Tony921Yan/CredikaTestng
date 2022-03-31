package com.meiji.biz.request.http.platform.orderDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeliverOrderGoods extends PlatformPost {
    {
        super.api = "OrderDetailManage/deliverOrderGoods"
        super.params =  [ "goodsList","logisticsCode","logisticsCompanyName","orderCode"]
    }
    DeliverOrderGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    DeliverOrderGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    DeliverOrderGoods baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        return this
    }

}

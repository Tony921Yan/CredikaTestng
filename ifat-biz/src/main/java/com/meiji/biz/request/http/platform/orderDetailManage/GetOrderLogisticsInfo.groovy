package com.meiji.biz.request.http.platform.orderDetailManage


import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderLogisticsInfo extends PlatformPost {
    {
        super.api = "OrderDetailManage/getOrderLogisticsInfo"
        super.params =  ["orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetOrderLogisticsInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderLogisticsInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderLogisticsInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

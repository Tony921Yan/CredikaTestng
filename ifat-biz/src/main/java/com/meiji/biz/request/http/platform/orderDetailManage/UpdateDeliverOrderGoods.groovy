package com.meiji.biz.request.http.platform.orderDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateDeliverOrderGoods extends PlatformPost {
    {
        super.api = "OrderDetailManage/updateDeliverOrderGoods"
        super.params =  [ "id","logisticsCode","logisticsCompanyName","orderCode"]
    }
    UpdateDeliverOrderGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    UpdateDeliverOrderGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    UpdateDeliverOrderGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

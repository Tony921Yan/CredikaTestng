package com.meiji.biz.request.http.platform.orderDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateOrderAddress extends PlatformPost {
    {
        super.api = "OrderDetailManage/updateOrderAddress"
        super.params =  [ "id","orderCode","receiverAddress","receiverName","receiverTel","address","city","province","district"]
    }
    UpdateOrderAddress invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    UpdateOrderAddress preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    UpdateOrderAddress baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

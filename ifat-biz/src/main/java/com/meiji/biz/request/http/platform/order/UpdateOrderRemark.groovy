package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateOrderRemark extends PlatformPost {
    {
        super.api = "/platform/orderMgr/updateOrderRemark"
        super.params =  [ "orderCode","remark"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }
    UpdateOrderRemark invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    UpdateOrderRemark preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    UpdateOrderRemark baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

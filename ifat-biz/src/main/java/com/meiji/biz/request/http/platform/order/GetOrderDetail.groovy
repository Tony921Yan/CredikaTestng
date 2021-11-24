package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformGet
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderDetail extends PlatformPost {
    {
        super.api = "OrderDetailManage/getOrderDetail"
        super.params =  [ "id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetOrderDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformGet
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderEventLog extends PlatformPost {
    {
        super.api = "OrderDetailManage/getOrderEventLog"
        super.params =  ["orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetOrderEventLog invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderEventLog preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderEventLog baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

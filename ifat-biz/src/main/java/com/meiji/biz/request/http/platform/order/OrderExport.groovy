package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class OrderExport extends PlatformGet{//get请求，后续优化
    {
        super.api = "orderDetailManage/orderExport"
        super.params =  [ "endTime","orderCode","orderStatus","orderType","receiverMsg","shopUserMsg","skuCode","startTime"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }
    OrderExport invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    OrderExport preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    OrderExport baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

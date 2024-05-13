package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class GetOrderCount extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "OrderDetailManage/getOrderCount"
       super.params = ["endTime","goodsCode","goodsName","orderCode","orderStatus","orderType","parentOrderCode","receiverMsg","shopName","shopUserMsg","skuCode","sourceType","spuType","startTime","supplierName","userMark"]
    }

    GetOrderCount invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderCount preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderCount baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}

package com.credika.biz.request.http.OMS.order


import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderLogisticsInfo extends OMSPost {
    {
        super.api = "OrderDetailManage/getOrderLogisticsInfo"
        super.params =  [ "supplierId","orderCode"]

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

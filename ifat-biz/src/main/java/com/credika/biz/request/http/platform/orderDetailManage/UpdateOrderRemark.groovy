package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class UpdateOrderRemark extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "OrderDetailManage/updateOrderRemark"
        super.params =  [ "orderCode","remark"]
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
        assert testContext.getResponse().code == 10
        return this
    }

}

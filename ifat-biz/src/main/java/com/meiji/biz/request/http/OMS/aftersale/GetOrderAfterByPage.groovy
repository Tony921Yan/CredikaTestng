package com.meiji.biz.request.http.OMS.aftersale
import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterByPage extends OMSPost {
    {
        super.api = "AftersalesDetailManage/getOrderByPage"
        super.params =  [ "condition","order","page","rows","sort"]
    }

    GetOrderAfterByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderAfterByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderAfterByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

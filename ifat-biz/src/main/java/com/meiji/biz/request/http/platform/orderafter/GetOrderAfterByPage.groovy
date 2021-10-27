package com.meiji.biz.request.http.platform.orderafter

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterByPage extends PlatformPost {
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
    }

    GetOrderAfterByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}

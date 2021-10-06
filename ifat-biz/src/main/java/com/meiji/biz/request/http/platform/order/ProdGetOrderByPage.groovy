package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ProdGetOrderByPage extends PlatformPost {
    {
        super.api = "/OrderDetailManage/getOrderByPage"
        super.params =  [ "condition","page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }
    PlatformPost invoke(TestContext testContext) {
            super.invoke(testContext)
            return this
        }
    PlatformPost preInvoke(TestContext testContext){
            super.preInvoke(testContext)
            return this
        }
    PlatformPost baseAssert(TestContext testContext){
            super.baseAssert(testContext)
        }

    PlatformPost specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert  apiResult.total > 20
    }
}

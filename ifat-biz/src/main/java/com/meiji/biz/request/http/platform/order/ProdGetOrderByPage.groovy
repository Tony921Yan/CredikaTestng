package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ProdGetOrderByPage extends PlatformPost {
    {
        super.api = "/OrderDetailManage/getOrderByPage"
        super.params =  [ "condition","page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }
    ProdGetOrderByPage invoke(TestContext testContext) {
            super.invoke(testContext)
            return this
        }
    ProdGetOrderByPage preInvoke(TestContext testContext){
            super.preInvoke(testContext)
            return this
        }
    ProdGetOrderByPage baseAssert(TestContext testContext){
            super.baseAssert(testContext)
            return this
        }

    ProdGetOrderByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert  apiResult.total > 20
        return this
    }
}

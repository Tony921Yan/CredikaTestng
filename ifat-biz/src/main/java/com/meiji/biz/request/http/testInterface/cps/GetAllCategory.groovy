package com.meiji.biz.request.http.testInterface.cps

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetAllCategory extends TestInterfacePost {
    {
        super.api = "/thirdparty/api/cps/getAllCategory"
        super.params =  ["userId"]
    }

    TestInterfacePost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    TestInterfacePost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    TestInterfacePost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}

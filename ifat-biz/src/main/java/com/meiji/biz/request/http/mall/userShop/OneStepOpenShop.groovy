package com.meiji.biz.request.http.mall.userShop

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class OneStepOpenShop extends MallPost{
    {
        super.api = "userShop/oneStepOpenShop"
        super.params = ["registerSource"]
    }

    OneStepOpenShop invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OneStepOpenShop preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OneStepOpenShop baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        return this
    }


}

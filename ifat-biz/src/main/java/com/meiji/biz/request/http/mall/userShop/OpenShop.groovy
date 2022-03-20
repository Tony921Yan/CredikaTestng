package com.meiji.biz.request.http.mall.userShop

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class OpenShop extends MallPost{
    {
        super.api = "userShop/openShop"
        super.params = ["shopIcon","shopName","brief","inviteCode","userId","registerSource"]
    }

    OpenShop invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OpenShop preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OpenShop baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        return this
    }


}

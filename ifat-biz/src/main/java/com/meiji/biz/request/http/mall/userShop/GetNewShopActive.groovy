package com.meiji.biz.request.http.mall.userShop

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetNewShopActive extends MallPost{
    {
        super.api = "userShop/getNewShopActive"
        super.params = []
    }

    GetNewShopActive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetNewShopActive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetNewShopActive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}

package com.meiji.biz.request.http.mall.userAddress

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class DeleteUserAddress extends MallPost {
    {
        super.api = "/userAddress/deleteUserAddress"
        super.params =  ["id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    DeleteUserAddress invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteUserAddress preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteUserAddress baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

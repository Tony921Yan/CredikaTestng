package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeleteBuyerShow extends PlatformPost {
    {
        super.api = "/ShareOrderManage/deleteBuyerShow"
        super.params =  ["ids"]
    }

    DeleteBuyerShow invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteBuyerShow preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteBuyerShow baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        return this
    }

}

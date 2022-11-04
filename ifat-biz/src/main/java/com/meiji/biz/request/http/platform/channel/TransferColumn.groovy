package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class TransferColumn extends PlatformPost {
    {
        super.api = "/ShareOrderManage/transferColumn"
        super.params =  ["columnId", "ids"]
    }

    TransferColumn invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    TransferColumn preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    TransferColumn baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        return this
    }

}

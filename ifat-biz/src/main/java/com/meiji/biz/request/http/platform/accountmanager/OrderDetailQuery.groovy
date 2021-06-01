package com.meiji.biz.request.http.platform.accountmanager

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class OrderDetailQuery extends PlatformGet{
    {
        super.api="/platform/finance/orderDetailQuery"
        super.params = ["orderCode"]
    }

    PlatformGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}

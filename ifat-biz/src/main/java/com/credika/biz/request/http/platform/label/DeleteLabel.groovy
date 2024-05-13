package com.credika.biz.request.http.platform.label

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeleteLabel extends PlatformPost{
    {
        super.api="goodsLabelList/deleteGoodsLabel"
        super.params = ["id"]
    }

    DeleteLabel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteLabel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteLabel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

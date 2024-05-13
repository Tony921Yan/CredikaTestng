package com.credika.biz.request.http.mall.hfjy

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class Page extends MallPost {
    {
        super.api = "/app/order/use/page"
        super.params =  ["condition","page","rows"]
    }

    Page invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Page baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

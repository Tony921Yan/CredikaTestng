package com.credika.biz.request.http.mall.hfjy
import com.credika.biz.request.http.mall.MallGet
import com.miyuan.ifat.support.test.TestContext

class MyAccount extends MallGet {
    {
        super.api = "/app/index/myAccount"
        super.params =  []
    }

    MyAccount invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MyAccount baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

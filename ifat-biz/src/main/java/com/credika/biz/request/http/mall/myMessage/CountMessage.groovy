package com.credika.biz.request.http.mall.myMessage

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class CountMessage extends MallPost{
    {
        super.api = "myMessage/countMessage" //接口地址
        super.params = []   //请求参数
    }

    CountMessage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CountMessage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CountMessage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

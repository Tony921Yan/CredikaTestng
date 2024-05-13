package com.credika.biz.request.http.mall.myMessage

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class UpdateMessageStatus extends MallPost{
    {
        super.api = "myMessage/updateMessageStatus" //接口地址
        super.params = ["isUpdateAll","messagdId"]   //请求参数
    }

    UpdateMessageStatus invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateMessageStatus preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateMessageStatus baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

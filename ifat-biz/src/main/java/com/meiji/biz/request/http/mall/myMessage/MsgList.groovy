package com.meiji.biz.request.http.mall.myMessage

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class MsgList extends MallPost{
    {
        super.api = "/myMessage/list" //接口地址
        super.params = ["condition","page","rows"]   //请求参数
    }

    MsgList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MsgList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MsgList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

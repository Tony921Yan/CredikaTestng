package com.meiji.biz.request.http.mall.gift

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetTutorialList extends MallPost {
    {
        super.api ="gift/getTutorialList" //接口地址
        super.params =  []  //请求参数
    }

    GetTutorialList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetTutorialList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetTutorialList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}


























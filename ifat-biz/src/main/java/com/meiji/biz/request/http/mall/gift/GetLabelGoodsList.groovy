package com.meiji.biz.request.http.mall.gift

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetLabelGoodsList extends MallPost {
    {
        super.api ="gift/getLabelGoodsList" //接口地址
        super.params =  ['categoryId']  //请求参数
    }

    GetLabelGoodsList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetLabelGoodsList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetLabelGoodsList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

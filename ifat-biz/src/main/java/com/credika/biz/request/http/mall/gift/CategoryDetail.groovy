package com.credika.biz.request.http.mall.gift

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class CategoryDetail extends MallPost {
    {
        super.api ="gift/categoryDetail" //接口地址
        super.params =  ['categoryId']  //请求参数
    }

    CategoryDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CategoryDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CategoryDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

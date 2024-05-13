package com.credika.biz.request.http.mall.gift

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetCategoryList extends MallPost {
    {
        super.api ="gift/getCategoryList" //接口地址
        super.params =  []  //请求参数
    }

    GetCategoryList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCategoryList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCategoryList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

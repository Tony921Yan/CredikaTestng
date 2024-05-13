package com.credika.biz.request.http.mall.userInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetCategoryListAndQrCode extends MallPost {
    {
        super.api = "customService/getCategoryListAndQrCode"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetCategoryListAndQrCode invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCategoryListAndQrCode baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

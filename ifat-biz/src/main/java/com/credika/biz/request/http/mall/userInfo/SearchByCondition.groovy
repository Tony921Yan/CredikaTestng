package com.credika.biz.request.http.mall.userInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SearchByCondition extends MallPost {
    {
        super.api = "customService/getCategoryListAndQrCode"
        super.params =  ["categoryId","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    SearchByCondition invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchByCondition baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

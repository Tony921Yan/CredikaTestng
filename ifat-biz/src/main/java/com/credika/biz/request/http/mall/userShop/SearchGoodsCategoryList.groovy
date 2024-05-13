package com.credika.biz.request.http.mall.userShop

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SearchGoodsCategoryList extends MallPost {
    {
        super.api ="shopGoods/searchGoodsCategoryList" //接口地址
        super.params =["shopId","searchText"]  //请求参数
    }

    SearchGoodsCategoryList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchGoodsCategoryList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchGoodsCategoryList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
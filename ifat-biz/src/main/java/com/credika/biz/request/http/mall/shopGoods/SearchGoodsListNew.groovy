package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SearchGoodsListNew extends MallPost {
    {
        super.api = "shopGoods/searchGoodsListNew"
        super.params =  ["page","rows","shopId","categoryIdList","searchText","normalSearchPage","searchWordPage","comprehensiveSort"]
    }

    SearchGoodsListNew invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchGoodsListNew preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchGoodsListNew baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

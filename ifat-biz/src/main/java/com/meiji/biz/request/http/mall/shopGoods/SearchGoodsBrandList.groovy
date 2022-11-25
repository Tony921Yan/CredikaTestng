package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SearchGoodsBrandList extends MallPost {
    {
        super.api ="/shopGoods/searchGoodsBrandList" //接口地址
        super.params =["shopId","searchText"]  //请求参数
    }

    SearchGoodsBrandList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchGoodsBrandList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchGoodsBrandList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

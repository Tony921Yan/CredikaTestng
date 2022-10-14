package com.meiji.biz.request.http.mall.userShop

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SearchGoodsListWithCategory extends MallPost {
    {
        super.api ="shopGoods/searchGoodsCategoryList" //接口地址
        super.params =["shopId","searchText"]  //请求参数
    }

    SearchGoodsListWithCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchGoodsListWithCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchGoodsListWithCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

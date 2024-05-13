package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindGoodsTopicDetail extends MallPost {
    {
        super.api = "/shopGoods/findGoodsTopicDetail"
        super.params =  [ "page","rows","priceSort","publishTimeSort","salesSort","comprehensiveSort","shopId","topicPageId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindGoodsTopicDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindGoodsTopicDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindGoodsTopicDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

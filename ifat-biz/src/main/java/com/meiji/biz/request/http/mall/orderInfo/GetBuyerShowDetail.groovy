package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class GetBuyerShowDetail extends MallPost {
    {
        super.api = "orderExhibit/getBuyerShowDetail"
        super.params =  ["goodsId"]
    }

    GetBuyerShowDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetBuyerShowDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetBuyerShowDetail baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10  //调起去晒物但不需要执行返回10
        return this
    }

}

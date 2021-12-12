package com.meiji.biz.request.http.mall.home

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/11/12-23:48
 */
class GetColumnAndColumnGoods extends MallPost {
    {
        super.api = "home/getColumnAndColumnGoods"
        super.params =  ["columnId","shopId","comprehensiveSort","page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetColumnAndColumnGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetColumnAndColumnGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetColumnAndColumnGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

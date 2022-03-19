package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy*
 * @date 2022/03/18 12:07
 * @Vession v2.6.3
 * */
class GetOrderIsSplit extends MallPost {
    {
        super.api = "orderInfo/getOrderIsSplit"
        super.params =  ["orderCode"]
    }

    GetOrderIsSplit invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderIsSplit preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderIsSplit baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

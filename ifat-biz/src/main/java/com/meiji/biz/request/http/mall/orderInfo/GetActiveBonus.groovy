package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class GetActiveBonus extends MallPost {
    {
        super.api = "orderInfo/getActiveBonus"
        super.params =  []
    }

    GetActiveBonus invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetActiveBonus preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetActiveBonus baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

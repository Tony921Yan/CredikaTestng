package com.meiji.biz.request.http.mall.material

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/12/13 09:17
 @version v2.3
 */
class GetShowBonus extends MallPost {
    {
        super.api = "orderExhibit/getShowBonus"
        super.params =  []
    }

    GetShowBonus invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetShowBonus preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetShowBonus baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}

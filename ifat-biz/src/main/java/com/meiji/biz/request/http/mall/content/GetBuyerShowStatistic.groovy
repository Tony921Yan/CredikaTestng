package com.meiji.biz.request.http.mall.content

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/07 14:30
 * @Vession V2.5
 */
class GetBuyerShowStatistic extends MallPost{
    {
        super.api = "orderExhibit/getBuyerShowStatistic"
        super.params = []
    }

    GetBuyerShowStatistic invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetBuyerShowStatistic baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

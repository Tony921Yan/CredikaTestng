package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/07 10:37
 * @Vession V2.5
 */
class GetBuyerShowLabelList extends MallPost{
    {
        super.api = "shopGoods/getBuyerShowLabelList"
        super.params = ["id"]
    }

    GetBuyerShowLabelList invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetBuyerShowLabelList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

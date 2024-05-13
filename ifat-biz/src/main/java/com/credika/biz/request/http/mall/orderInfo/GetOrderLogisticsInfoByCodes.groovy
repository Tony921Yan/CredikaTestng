package com.credika.biz.request.http.mall.orderInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/01/29 18:32
 * @Vession V2.5
 */
class GetOrderLogisticsInfoByCodes extends MallPost{
    {
        super.api = "orderInfo/getOrderLogisticsInfoByCodes"
        super.params = ["orderCodeList"]
    }

    GetOrderLogisticsInfoByCodes invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetOrderLogisticsInfoByCodes baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

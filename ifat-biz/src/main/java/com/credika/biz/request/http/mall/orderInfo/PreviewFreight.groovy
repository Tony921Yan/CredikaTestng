package com.credika.biz.request.http.mall.orderInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class PreviewFreight extends MallPost {
    {
        super.api = "orderInfo/previewFreight"
        super.params =  ["orderGoods","addressId"]
    }

    PreviewFreight invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PreviewFreight preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PreviewFreight baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

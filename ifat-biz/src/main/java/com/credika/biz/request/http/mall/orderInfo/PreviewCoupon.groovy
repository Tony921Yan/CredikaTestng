package com.credika.biz.request.http.mall.orderInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2022/3/18 22:32
 @version v2.6.3
 */
class PreviewCoupon extends MallPost {
    {
        super.api = "orderInfo/previewCoupon"
        super.params =  ["orderGoods","orderType","shopId"]
    }

    PreviewCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PreviewCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PreviewCoupon baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

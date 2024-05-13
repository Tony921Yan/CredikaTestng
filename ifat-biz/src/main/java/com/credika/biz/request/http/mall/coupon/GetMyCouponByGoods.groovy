package com.credika.biz.request.http.mall.coupon

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy
 * * @date 2022/03/20 23:18
 * @Vession V2.6.3
 * */
class GetMyCouponByGoods extends MallPost{
    {
        super.api = "coupon/getMyCouponByGoods"
       super.params = ["spuId","status"]
    }

    GetMyCouponByGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMyCouponByGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMyCouponByGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}

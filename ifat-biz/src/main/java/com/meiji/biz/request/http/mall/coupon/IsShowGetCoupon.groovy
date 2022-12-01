package com.meiji.biz.request.http.mall.coupon

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class IsShowGetCoupon extends MallPost{
    {
        super.api = "coupon/isShowGetCoupon"
       super.params = ["source","spuId","defaultSkuId"]
    }

    IsShowGetCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    IsShowGetCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    IsShowGetCoupon baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    IsShowGetCoupon afterInvoke(TestContext testContext){
       def apiResult = testContext.getResponse().data
        println(apiResult)
        if(apiResult==[:]){
            println("暂无已发布的领券活动")
            throw new SkipException("暂无已发布的领券活动")
        }
        testContext.put("couponActId",apiResult.activeId)
        testContext.put("coupons",apiResult.coupons)
        testContext.put("activeId",apiResult.activeId)
        return this
    }


}

package com.credika.biz.request.http.platform.grantCouponActive


import com.miyuan.ifat.support.test.TestContext
class UserIntegralCouponByPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="grantCouponActive/userIntegralCouponByPage"
        super.params = ["condition","page","rows"]
    }

    UserIntegralCouponByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UserIntegralCouponByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UserIntegralCouponByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    UserIntegralCouponByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        List mysqlResult = com.credika.biz.service.MysqlService.UserIntegralCouponByPage(testContext.get("activeId"),testContext.get("couponId"))
        System.out.println("apiResult" + apiResult)
        System.out.println("mysqlResult" + mysqlResult)
 //       assert apiResult.size() == mysqlResult.size()
    }
}
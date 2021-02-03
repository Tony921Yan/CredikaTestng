package com.miyuan.test.api.goods

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.goods.CouponGetCouponUrl
import com.miyuan.service.UserService
import org.testng.annotations.Test

class CouponGetCouponUrlTest extends BaseTest{
    CouponGetCouponUrl couponGetCouponUrl = new CouponGetCouponUrl()
    @Test(description = "获取优惠券链接-淘宝" ,groups = ["prod","uat"],testName = "couponGetCouponUrlSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCouponUrlSuccess(TestContext testContext){
        couponGetCouponUrl.preInvoke(testContext).invoke(testContext).baseAssert(testContext)
        UserService.getUserFromDb(testContext)
        def couponUrl = testContext.getResponse().data.couponUrl
        assert couponUrl.contains(String.valueOf(testContext.get("rid")))
        assert couponUrl.contains(String.valueOf(testContext.get("pid")))
    }


    @Test(description = "获取优惠券链接-ItemSource为空" ,groups = ["prod","uat"],testName = "couponGetCouponUrlItemSourceNull",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void couponGetCouponUrlItemSourceNull(TestContext testContext){
        couponGetCouponUrl.preInvoke(testContext)
        testContext.put("itemSource",null)
        couponGetCouponUrl.invoke(testContext).baseAssert(testContext)
        UserService.getUserFromDb(testContext)
        String couponUrl = testContext.getResponse().data.couponUrl
        assert couponUrl.contains(String.valueOf(testContext.get("rid")))
        assert couponUrl.contains(String.valueOf(testContext.get("pid")))
    }

    @Test(description = "获取优惠券链接-ItemSourceId为空" ,groups = ["prod","uat"],testName = "couponGetCouponUrlItemSourceIdNull",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void couponGetCouponUrlItemSourceIdNull(TestContext testContext){
        couponGetCouponUrl.invoke(testContext)
        assert testContext.getResponse().code == "B70001"
    }

    @Test(description = "获取优惠券链接-多用户" ,groups = ["prod","uat"],testName = "couponGetCouponUrlMultiuser",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void couponGetCouponUrlMultiuser(TestContext testContext){
        couponGetCouponUrl.preInvoke(testContext).invoke(testContext).baseAssert(testContext)
        UserService.getUserFromDb(testContext)
        String couponUrl = testContext.getResponse().data.couponUrl
        assert couponUrl.contains(String.valueOf(testContext.get("rid")))
        assert couponUrl.contains(String.valueOf(testContext.get("pid")))
        testContext.put("token",testContext.get("otherToken"))
        testContext.put("userId",testContext.get("otherUserId"))
        couponGetCouponUrl.invoke(testContext).baseAssert(testContext)
        UserService.getUserFromDb(testContext)
        String couponUrl2 = testContext.getResponse().data.couponUrl
        assert couponUrl2.contains(String.valueOf(testContext.get("rid")))
        assert couponUrl2.contains(String.valueOf(testContext.get("pid")))
    }
}



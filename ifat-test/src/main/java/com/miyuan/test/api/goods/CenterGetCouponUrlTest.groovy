package com.miyuan.test.api.goods

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.goods.CenterGetCouponUrl
import org.testng.annotations.Test

class CenterGetCouponUrlTest extends BaseTest{
    CenterGetCouponUrl centerGetCouponUrl = new CenterGetCouponUrl()
    @Test(description = "获取优惠券链接-淘宝" ,groups = ["prod","uat"],testName = "centerGetCouponUrlSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCouponUrlSuccess(TestContext testContext){
        centerGetCouponUrl.preInvoke(testContext).invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取优惠券链接-京东" ,groups = ["prod","uat"],testName = "centerGetCouponUrlItemSource2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCouponUrlItemSource2(TestContext testContext){
        centerGetCouponUrl.preInvoke(testContext).invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取优惠券链接-唯品会" ,groups = ["prod","uat"],testName = "centerGetCouponUrlItemSource3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCouponUrlItemSource3(TestContext testContext){
        centerGetCouponUrl.preInvoke(testContext).invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取优惠券链接-考拉" ,groups = ["prod","uat"],testName = "centerGetCouponUrlItemSource4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCouponUrlItemSource4(TestContext testContext){
        centerGetCouponUrl.preInvoke(testContext).invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取优惠券链接-拼多多" ,groups = ["prod","uat"],testName = "centerGetCouponUrlItemSource5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCouponUrlItemSource5(TestContext testContext){
        centerGetCouponUrl.preInvoke(testContext).invoke(testContext).baseAssert(testContext)
    }
}



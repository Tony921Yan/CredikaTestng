package com.meiji.test.http.platform.coupon

import com.meiji.biz.request.http.platform.coupon.GetGrantCouponActiveByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGrantCouponActiveByPageTest extends BaseTest {
    GetGrantCouponActiveByPage getGrantCouponActiveByPage = new GetGrantCouponActiveByPage()
    @Test(description = "优惠券库存管理-全部 getGrantCouponActiveByPage" ,groups = ["prod","uat"],testName = "getGrantCouponActiveByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGrantCouponActiveByPage(TestContext testContext){
        getGrantCouponActiveByPage.invoke(testContext).baseAssert(testContext)
    }


    @Test(description = "优惠券库存管理-活动名称查询 getGrantCouponActiveByPage" ,groups = ["prod","uat"],testName = "getGrantCouponActiveByPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGrantCouponActiveByPage1(TestContext testContext){
        getGrantCouponActiveByPage.invoke(testContext).baseAssert(testContext)
    }

}
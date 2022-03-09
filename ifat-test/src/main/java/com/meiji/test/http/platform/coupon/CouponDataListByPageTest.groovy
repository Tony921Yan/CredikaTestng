package com.meiji.test.http.platform.coupon

import com.meiji.biz.request.http.platform.coupon.CouponDataListByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CouponDataListByPageTest extends BaseTest {
    CouponDataListByPage couponDataListByPage = new CouponDataListByPage()
    @Test(description = "优惠券数据 couponDataListByPage" ,groups = ["prod","uat"],testName = "couponDataListByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void couponDataListByPage(TestContext testContext){
        couponDataListByPage.invoke(testContext).baseAssert(testContext)
    }

}
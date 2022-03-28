package com.meiji.test.http.mall.coupon

import com.meiji.biz.request.http.mall.coupon.GetActiveCoupon
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetActiveCouponTest extends BaseTest {
    GetActiveCoupon getActiveCoupon = new GetActiveCoupon()
    @Test(description = "查询券活动 getActiveCoupon" ,groups = ["prod","uat"],testName = "getActiveCoupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveCoupon(TestContext testContext){
        getActiveCoupon.invoke(testContext).baseAssert(testContext)
    }
}
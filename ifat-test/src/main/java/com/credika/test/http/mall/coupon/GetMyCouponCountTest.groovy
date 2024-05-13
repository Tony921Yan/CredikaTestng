package com.credika.test.http.mall.coupon


import com.credika.biz.request.http.mall.coupon.GetMyCouponCount
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMyCouponCountTest extends BaseTest {
    GetMyCouponCount getMyCouponCount = new GetMyCouponCount()

    @Test(description = "即将失效的优惠券 getMyCouponCount" ,groups = ["prod","uat"],testName = "getMyCouponCount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMyCouponCount(TestContext testContext){
        getMyCouponCount.invoke(testContext).baseAssert(testContext)
    }
}
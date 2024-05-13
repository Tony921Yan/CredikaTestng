package com.credika.test.http.mall.coupon

import com.credika.biz.request.http.mall.coupon.GetMyCoupon
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMyCouponTest extends BaseTest {
    GetMyCoupon getMyCoupon = new GetMyCoupon()
    Random rand = new Random()

    @Test(description = "我的优惠券 getMyCoupon" ,groups = ["prod","uat"],testName = "getMyCoupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMyCoupon(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("status", rand.nextInt(3)+1)    //1.未使用；2.已使用; 3.已过期
        getMyCoupon.invoke(testContext).baseAssert(testContext)
    }


}
package com.credika.test.http.mall.memberDay
import com.credika.biz.request.http.mall.memberDay.GetMemberDayCouponList
import com.credika.biz.request.http.mall.memberDay.ReceiveActiveCoupon
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ReceiveActiveCouponTest extends BaseTest {
    ReceiveActiveCoupon receiveActiveCoupon = new ReceiveActiveCoupon()
    GetMemberDayCouponList getMemberDayCouponList = new GetMemberDayCouponList()
    @Test(description = "会员日领券 receiveActiveCoupon" ,groups = ["prod","uat"],testName = "receiveActiveCoupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void receiveActiveCoupon(TestContext testContext){
        getMemberDayCouponList.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        receiveActiveCoupon.invoke(testContext).baseAssert(testContext)
    }
}

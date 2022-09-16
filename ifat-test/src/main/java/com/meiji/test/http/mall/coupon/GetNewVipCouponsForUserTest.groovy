package com.meiji.test.http.mall.coupon


import com.meiji.biz.request.http.mall.coupon.GetNewVipCouponsForUser
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetNewVipCouponsForUserTest extends BaseTest {
    GetNewVipCouponsForUser getNewVipCouponsForUser = new GetNewVipCouponsForUser()
    @Test(description = "查询用户领的券包 getNewVipCouponsForUser" ,groups = ["prod","uat"],testName = "getNewVipCouponsForUser-mall",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getNewVipCouponsForUser(TestContext testContext){
        getNewVipCouponsForUser.invoke(testContext).baseAssert(testContext)
    }
}
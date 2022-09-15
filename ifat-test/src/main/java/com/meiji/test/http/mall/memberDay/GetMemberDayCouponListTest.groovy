package com.meiji.test.http.mall.memberDay
import com.meiji.biz.request.http.mall.memberDay.GetMemberDayCouponList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMemberDayCouponListTest extends BaseTest {
    GetMemberDayCouponList getMemberDayCouponList = new GetMemberDayCouponList()
    @Test(description = "获取会员日券包 getMemberDayCouponList" ,groups = ["prod","uat"],testName = "getMemberDayCouponList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMemberDayCouponList(TestContext testContext){
        getMemberDayCouponList.invoke(testContext).baseAssert(testContext)
    }
}

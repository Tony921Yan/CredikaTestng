package com.meiji.test.http.mall.memberDay
import com.meiji.biz.request.http.mall.memberDay.GetMemberDayDiscountZoneData
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMemberDayDiscountZoneDataTest extends BaseTest {
    GetMemberDayDiscountZoneData getMemberDayDiscountZoneData = new GetMemberDayDiscountZoneData()
    @Test(description = "获取会员日折扣专区分页数据 getMemberDayDiscountZoneData" ,groups = ["prod","uat"],testName = "getMemberDayDiscountZoneData",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMemberDayDiscountZoneData(TestContext testContext){
        getMemberDayDiscountZoneData.invoke(testContext).baseAssert(testContext)
    }
}

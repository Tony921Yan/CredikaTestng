package com.meiji.test.http.mall.memberDay
import com.meiji.biz.request.http.mall.memberDay.GetMemberDayActiveBrief
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMemberDayActiveBriefTest extends BaseTest {
    GetMemberDayActiveBrief getMemberDayActiveBrief = new GetMemberDayActiveBrief()
    @Test(description = "权益页获取会员日活动数据 getMemberDayActiveBrief" ,groups = ["prod","uat"],testName = "getMemberDayActiveBrief",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMemberDayActiveBrief(TestContext testContext){
        getMemberDayActiveBrief.invoke(testContext).baseAssert(testContext)
    }
}

package com.meiji.test.http.mall.memberDay
import com.meiji.biz.request.http.mall.memberDay.GetMemberDayActiveBrief
import com.meiji.biz.request.http.mall.memberDay.MemberDaySubscribeNotice
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MemberDaySubscribeNoticeTest extends BaseTest {
    MemberDaySubscribeNotice memberDaySubscribeNotice = new MemberDaySubscribeNotice()
    GetMemberDayActiveBrief getMemberDayActiveBrief = new GetMemberDayActiveBrief()
    @Test(description = "订阅活动开始提醒 memberDaySubscribeNotice" ,groups = ["prod","uat"],testName = "memberDaySubscribeNotice",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void receiveActiveCoupon(TestContext testContext){
        getMemberDayActiveBrief.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        memberDaySubscribeNotice.invoke(testContext).baseAssert(testContext)


    }
}

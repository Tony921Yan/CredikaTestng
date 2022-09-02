package com.meiji.test.http.platform.memeberDayConfig
import com.meiji.biz.request.http.platform.memeberDayConfig.MemberDayConfigQuery
import com.meiji.biz.request.http.platform.memeberDayConfig.MemberDayConfigSubmit
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MemberDayConfigSubmitTest extends BaseTest {
    MemberDayConfigSubmit memberDayConfigSubmit = new MemberDayConfigSubmit()
    MemberDayConfigQuery memberDayConfigQuery = new MemberDayConfigQuery()
    @Test(description = "会员日配置提交 memberDayConfigQuery" ,groups = ["prod","uat"],testName = "memberDayConfigSubmit",
           dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void memberDayConfigQuery(TestContext testContext){
        memberDayConfigQuery.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        memberDayConfigSubmit.invoke(testContext).baseAssert(testContext)
    }
}

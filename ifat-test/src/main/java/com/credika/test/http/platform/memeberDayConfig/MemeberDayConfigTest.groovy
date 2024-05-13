package com.credika.test.http.platform.memeberDayConfig
import com.credika.biz.request.http.platform.memeberDayConfig.MemberDayConfigQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MemeberDayConfigTest extends BaseTest {
    MemberDayConfigQuery memberDayConfigQuery = new MemberDayConfigQuery()
    @Test(description = "会员日配置查询 memberDayConfigQuery" ,groups = ["prod","uat"],testName = "memberDayConfigQuery",
           dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void memberDayConfigQuery(TestContext testContext){
        memberDayConfigQuery.invoke(testContext).baseAssert(testContext)
    }
}

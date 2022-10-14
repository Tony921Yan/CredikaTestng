package com.meiji.test.http.mall.welfareCenter
import com.meiji.biz.request.http.mall.welfareCenter.MemberTaskFinshRemind
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MemberTaskFinshRemindTest extends BaseTest {
    MemberTaskFinshRemind memberTaskFinshRemind = new MemberTaskFinshRemind()
    @Test(description = "任务完成-查询任务奖励 memberTaskFinshRemind" ,groups = ["prod","uat"],testName = "",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void memberTaskQuery(TestContext testContext){
        memberTaskFinshRemind.invoke(testContext).baseAssert(testContext)
    }
}

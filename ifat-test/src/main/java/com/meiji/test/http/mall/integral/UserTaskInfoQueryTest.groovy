package com.meiji.test.http.mall.integral
import com.meiji.biz.request.http.mall.integral.UserTaskInfoQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
class UserTaskInfoQueryTest extends BaseTest{
    UserTaskInfoQuery userTaskInfoQuery = new UserTaskInfoQuery()
    @Test(description = "用户任务信息查询 userTaskInfoQuery" ,groups = ["prod","uat"],testName = "userTaskInfoQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelData(TestContext testContext){
        userTaskInfoQuery.invoke(testContext).baseAssert(testContext)
    }
}

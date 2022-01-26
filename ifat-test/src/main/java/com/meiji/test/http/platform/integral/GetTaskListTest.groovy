package com.meiji.test.http.platform.integral
import com.meiji.biz.request.http.platform.integral.GetTaskList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetTaskListTest extends BaseTest {
    GetTaskList getTaskList = new GetTaskList()
    @Test(description = "任务分页查询 getTaskList" ,groups = ["prod","uat"],testName = "getTaskList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        getTaskList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

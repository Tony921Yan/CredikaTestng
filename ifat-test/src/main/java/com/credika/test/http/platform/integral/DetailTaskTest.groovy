package com.credika.test.http.platform.integral
import com.credika.biz.request.http.platform.integral.DetailTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DetailTaskTest extends BaseTest {
    DetailTask detailTask = new DetailTask()
    @Test(description = "任务明细查询 detailTask" ,groups = ["prod","uat"],testName = "detailTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        detailTask.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

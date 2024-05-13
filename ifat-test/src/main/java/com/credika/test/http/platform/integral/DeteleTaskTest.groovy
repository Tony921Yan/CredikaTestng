package com.credika.test.http.platform.integral
import com.credika.biz.request.http.platform.integral.DeteleTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeteleTaskTest extends BaseTest {
    DeteleTask deteleTask = new DeteleTask()
    @Test(description = "删除任务 deteleTask" ,groups = ["prod","uat"],testName = "deteleTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        deteleTask.invoke(testContext).baseAssert(testContext)
    }
}

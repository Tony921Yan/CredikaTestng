package com.credika.test.http.platform.raffleActivity
import com.credika.biz.request.http.platform.raffleActivity.Operate
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class OperateTest extends BaseTest {
    Operate operate = new Operate()
    @Test(description = "提交抽奖活动 operate", groups = ["prod", "uat"], testName = "operate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void operate(TestContext testContext) {
        testContext.put("status", 2)
        testContext.put("id", MysqlService.raffleActiveStatus("2"))
        operate.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "发布抽奖活动 operate",groups = ["prod","uat"],testName ="operate",
         dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void operate1(TestContext testContext){
        testContext.put("status",3)
        testContext.put("id",MysqlService.raffleActiveStatus("3"))
        operate.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "取消抽奖活动 operate" ,groups = ["prod","uat"],testName = "operate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void operate2(TestContext testContext){
        testContext.put("status",6)
        testContext.put("id", MysqlService.raffleActiveStatus("4"))
        operate.invoke(testContext).baseAssert(testContext)
    }
}
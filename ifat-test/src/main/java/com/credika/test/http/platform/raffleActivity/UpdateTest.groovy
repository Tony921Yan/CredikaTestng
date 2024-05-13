package com.credika.test.http.platform.raffleActivity
import com.credika.biz.request.http.platform.raffleActivity.Update
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateTest extends BaseTest {
    Update update = new Update()
    @Test(description = "修改抽奖活动 update" ,groups = ["prod","uat"],testName = "update",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void update(TestContext testContext){
        testContext.put("id", MysqlService.getRaffleActiveID())
        update.invoke(testContext).baseAssert(testContext)
    }

}
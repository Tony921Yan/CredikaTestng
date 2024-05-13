package com.credika.test.http.platform.raffleActivity
import com.credika.biz.request.http.platform.raffleActivity.Add
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddTest extends BaseTest {
    Add add = new Add()
    @Test(description = "活动管理-新增抽奖活动 add" ,groups = ["prod","uat"],testName = "add",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void add(TestContext testContext){
        add.invoke(testContext).baseAssert(testContext)
    }

}
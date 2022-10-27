package com.meiji.test.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.activeMainManage.giftManage.AddCombination
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddCombinationTest extends BaseTest {
    AddCombination addCombination = new AddCombination()
    @Test(description = "送礼管理-组合商品新增 addCombination" ,groups = ["prod","uat"],testName = "addCombination",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addCombination(TestContext testContext){
        addCombination.invoke(testContext).baseAssert(testContext)
    }

}
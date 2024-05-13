package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.CombinationDetail
import com.credika.biz.request.http.platform.activeMainManage.giftManage.EditCombination
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class EditCombinationTest extends BaseTest {
    EditCombination editCombination = new EditCombination()
    CombinationDetail combinationDetail = new CombinationDetail()
    @Test(description = "送礼管理-组合礼品修改 editCombination" ,groups = ["prod","uat"],testName = "editCombination",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void editCombination(TestContext testContext){
        testContext.put("id", MysqlService.combinationDetail())
        combinationDetail.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        editCombination.invoke(testContext).baseAssert(testContext)
    }

}
package com.meiji.test.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.activeMainManage.giftManage.CombinationDetail
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CombinationDetailTest extends BaseTest {
    CombinationDetail combinationDetail = new CombinationDetail()
    @Test(description = "送礼管理-组合礼品详情查询 categoryDetail" ,groups = ["prod","uat"],testName = "combinationDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void combinationDetail(TestContext testContext){
        testContext.put("id", MysqlService.combinationDetail())
        combinationDetail.invoke(testContext).baseAssert(testContext)
    }
}
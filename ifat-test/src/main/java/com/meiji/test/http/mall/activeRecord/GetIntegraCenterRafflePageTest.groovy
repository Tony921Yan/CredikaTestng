package com.meiji.test.http.mall.activeRecord
import com.meiji.biz.request.http.mall.activeRecord.GetIntegraCenterRafflePage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetIntegraCenterRafflePageTest extends BaseTest {
    GetIntegraCenterRafflePage getIntegraCenterRafflePage = new GetIntegraCenterRafflePage()
    @Test(description = "积分中心-积分抽奖入口 getIntegraCenterRafflePage" ,groups = ["prod","uat"],testName = "getIntegraCenterRafflePage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getIntegraCenterRafflePage(TestContext testContext){
        getIntegraCenterRafflePage.invoke(testContext).baseAssert(testContext)
    }
}
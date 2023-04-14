package com.meiji.test.http.mall.traceability
import com.meiji.biz.request.http.mall.traceability.GetSpuGifts
import com.meiji.biz.request.http.mall.traceability.LogBuyerShowTrace
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author TonyYan　　　　　　　
 * * @date 2023/01/03
 * @Vession V3.7
 * */
class LogBuyerShowTraceTest extends BaseTest {
    LogBuyerShowTrace logBuyerShowTrace = new LogBuyerShowTrace()
    @Test(description = "晒单数据埋点 logBuyerShowTrace" ,groups = ["prod","uat"],testName = "logBuyerShowTrace",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void logBuyerShowTrace(TestContext testContext){
//        testContext.put("id", MysqlService.logBuyerShowTrace(userId).get(0))
        logBuyerShowTrace.invoke(testContext).baseAssert(testContext)
    }
}
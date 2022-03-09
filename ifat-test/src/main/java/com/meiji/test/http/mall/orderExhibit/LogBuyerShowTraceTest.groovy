package com.meiji.test.http.mall.orderExhibit

import com.meiji.biz.request.http.mall.orderExhibit.LogBuyerShowTrace
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/16 22:32
 @version v2.3
 */
class LogBuyerShowTraceTest extends BaseTest {
    LogBuyerShowTrace logBuyerShowTrace = new LogBuyerShowTrace();
    @Test(description = "点赞 logBuyerShowTrace" ,groups = ["prod","uat"],testName = "logBuyerShowTrace",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void logBuyerShowTrace(TestContext testContext){
        logBuyerShowTrace.invoke(testContext).baseAssert(testContext)
    }
}

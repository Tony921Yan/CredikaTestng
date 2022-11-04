package com.meiji.test.http.OMS.goodsOriginManage
import com.meiji.biz.request.http.OMS.goodsOriginManage.GetGoodsByPage
import com.meiji.biz.request.http.OMS.goodsOriginManage.UpdateTrace
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateTraceTest extends BaseTest {
    UpdateTrace updateTrace = new UpdateTrace()
    GetGoodsByPage getGoodsByPage =new GetGoodsByPage()
    @Test(description = "更新溯源 updateTrace" ,groups = ["prod","uat"],testName = "updateTrace",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void updateTrace(TestContext testContext){
        testContext.put("status",1)
        testContext.put("pageNum",1)
        testContext.put("pageSize",20)
        testContext.put("supplierId",77)
        getGoodsByPage.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        updateTrace.invoke(testContext).baseAssert(testContext)
    }
}


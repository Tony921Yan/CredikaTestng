package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.MiyuanPageOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MiyuanPageOrderTest extends BaseTest {
    MiyuanPageOrder miyuanPageOrder = new MiyuanPageOrder()
    @Test(description = "订单列表查询 miyuanPageOrder" ,groups = ["prod","uat"],testName = "miyuanPageOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void miyuanPageOrder(TestContext testContext){
        testContext.put("page",1)
        testContext.put("pageSize",100)
        testContext.put("queryType",0)
        testContext.put("endTime","2021-10-13 19:31:14")
        testContext.put("startTime","2021-10-15 19:31:14")
        miyuanPageOrder.invoke(testContext).baseAssert(testContext)
    }
}

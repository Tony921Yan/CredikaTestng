package com.meiji.test.http.mall.orderInfo


import com.meiji.biz.request.http.shop.order.FlowTotalData
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FlowTotalDataTest extends BaseTest {
    FlowTotalData flowTotalData = new FlowTotalData()
    @Test(description = "获取月度收支数据信息 flowTotalData" ,groups = ["prod","uat"],testName = "flowTotalData",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void flowTotalData(TestContext testContext){
        testContext.put("month",7)
        testContext.put("shopId",1405981112139808)
        testContext.put("tradeType",4)
        testContext.put("year",2021)
        flowTotalData.invoke(testContext).baseAssert(testContext)
    }
}

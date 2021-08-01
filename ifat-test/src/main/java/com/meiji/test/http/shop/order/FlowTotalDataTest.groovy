package com.meiji.test.http.shop.order

import com.meiji.biz.request.http.shop.order.AccountIndexQuery
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
        flowTotalData.invoke(testContext).baseAssert(testContext)
    }
}

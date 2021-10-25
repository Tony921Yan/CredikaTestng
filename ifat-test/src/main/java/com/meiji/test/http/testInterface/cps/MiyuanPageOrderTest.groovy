package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.MiyuanPageOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MiyuanPageOrderTest extends BaseTest {
    MiyuanPageOrder miyuanPageOrder = new MiyuanPageOrder()
    @Test(description = "订单列表查询-订单创建时间查询 miyuanPageOrder" ,groups = ["prod","uat"],testName = "prodmiyuanPageOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void miyuanPageOrder(TestContext testContext){
        testContext.put("startTime","2021-10-21 14:30:00")
        testContext.put("endTime","2021-10-21 14:30:00")
        testContext.put("queryType",0)
        testContext.put("oid","O2021102514470598801")
        miyuanPageOrder.invoke(testContext).baseAssert(testContext)
    }

}


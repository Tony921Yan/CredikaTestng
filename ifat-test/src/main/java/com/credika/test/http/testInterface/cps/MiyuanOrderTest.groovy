package com.credika.test.http.testInterface.cps

import com.credika.biz.request.http.testInterface.cps.MiyuanOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MiyuanOrderTest extends BaseTest {
    MiyuanOrder miyuanOrder = new MiyuanOrder()
    @Test(description = "订单详情查询 miyuanOrder" ,groups = ["prod","uat"],testName = "miyuanOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void miyuanOrder(TestContext testContext){
        testContext.put("oid","O2021103119240023903")
        miyuanOrder.invoke(testContext).baseAssert(testContext)
    }

}


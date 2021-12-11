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
        testContext.put("startTime","2021-11-18 09:00:00")
        testContext.put("endTime","2021-11-18 19:30:00")
        testContext.put("queryType",3)      // 1:订单更新时间; 2:订单结算时间； 3:订单创建时间； 4:订单付款时间；
        //testContext.put("oid","O2021111611460417783")

        miyuanPageOrder.invoke(testContext).baseAssert(testContext)
    }

}


package com.credika.test.http.mall.shopGoods

import com.credika.biz.request.http.mall.shopGoods.SettlementStatusQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SettlementStatusQueryTest extends BaseTest {
    SettlementStatusQuery settlementStatusQuery = new SettlementStatusQuery()
    @Test(description = "查询小B是否商户号/企业到零钱 settlementStatusQuery" ,groups = ["prod","uat"],testName = "settlementStatusQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void settlementStatusQuery(TestContext testContext){
        testContext.put("userId",1479903381815359)
        testContext.put("shopId",1481287764279359)
        settlementStatusQuery.invoke(testContext).baseAssert(testContext)
    }
}

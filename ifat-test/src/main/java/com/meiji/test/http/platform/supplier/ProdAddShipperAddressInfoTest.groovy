package com.meiji.test.http.platform.supplier


import com.meiji.biz.request.http.platform.order.ProdGetOrderByPage
import com.meiji.biz.request.http.platform.suppiler.ProdAddShipperAddressInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProdAddShipperAddressInfoTest extends BaseTest {
    ProdAddShipperAddressInfo prodAddShipperAddressInfo = new ProdAddShipperAddressInfo()
    @Test(description = "新增供应商发货地址 prodAddShipperAddressInfo" ,groups = ["prod","uat"],testName = "prodAddShipperAddressInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void prodAddShipperAddressInfo(TestContext testContext){
//        prodAddShipperAddressInfo.testContext.put("condition", JsonUtil.objToJsonList(testContext.get("condition")))
        prodAddShipperAddressInfo.invoke(testContext).baseAssert(testContext)
    }
}
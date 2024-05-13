package com.credika.test.http.platform.supplier
import com.credika.biz.request.http.platform.suppiler.AddShipperAddressInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddShipperAddressInfoTest extends BaseTest {
    AddShipperAddressInfo addShipperAddressInfo = new AddShipperAddressInfo()
    @Test(description = "新增供应商发货地址 addShipperAddressInfo" ,groups = ["prod","uat"],testName = "addShipperAddressInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addShipperAddressInfo(TestContext testContext){
        addShipperAddressInfo.invoke(testContext).baseAssert(testContext)
    }
}
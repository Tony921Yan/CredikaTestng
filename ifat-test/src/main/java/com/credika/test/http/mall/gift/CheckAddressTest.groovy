package com.credika.test.http.mall.gift

import com.credika.biz.request.http.mall.gift.CheckAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CheckAddressTest extends BaseTest {
    CheckAddress checkAddress = new CheckAddress()
    @Test(description = "检查收货地址 checkAddress" ,groups = ["prod","uat"],testName = "checkAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void checkAddress(TestContext testContext){
        testContext.put("addressId",1450167892967456)
        testContext.put("giftId",1453425634050080)
        checkAddress.invoke(testContext).baseAssert(testContext)
    }
}
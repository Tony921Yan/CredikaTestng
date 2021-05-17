package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class   FindDefaultUserAddressTest extends BaseTest {
    com.meiji.biz.request.http.mall.FindDefaultUserAddress findDefaultUserAddress = new com.meiji.biz.request.http.mall.FindDefaultUserAddress()
    @Test(description = "查询默认收货地址 findDefaultUserAddress" ,groups = ["prod","uat"],testName = "findDefaultUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findDefaultUserAddress(TestContext testContext){
        findDefaultUserAddress.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

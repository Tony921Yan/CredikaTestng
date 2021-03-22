package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.FindDefaultUserAddress
import org.testng.annotations.Test

class FindDefaultUserAddressTest extends BaseTest {
    FindDefaultUserAddress findDefaultUserAddress = new FindDefaultUserAddress()
    @Test(description = "查询默认收货地址 findDefaultUserAddress" ,groups = ["prod","uat"],testName = "findDefaultUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findDefaultUserAddress(TestContext testContext){
        findDefaultUserAddress.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

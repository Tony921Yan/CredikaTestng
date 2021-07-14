package com.meiji.test.http.mall.userAddress

import com.meiji.biz.request.http.mall.userAddress.FindDefaultUserAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class   FindDefaultUserAddressTest extends BaseTest {
    FindDefaultUserAddress findDefaultUserAddress = new FindDefaultUserAddress()
    @Test(description = "查询默认收货地址 findDefaultUserAddress" ,groups = ["prod","uat"],testName = "findDefaultUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findDefaultUserAddress(TestContext testContext){
        findDefaultUserAddress.invoke(testContext).baseAssert(testContext)
    }
}

package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.AddUserAddress
import org.testng.annotations.Test

class AddUserAddressTest extends BaseTest {
    AddUserAddress addUserAddress = new AddUserAddress()
    @Test(description = "新增收货地址 addUserAddress" ,groups = ["prod","uat"],testName = "addUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addUserAddress(TestContext testContext){
        addUserAddress.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

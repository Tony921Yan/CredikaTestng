package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddUserAddressTest extends BaseTest {
    com.meiji.biz.request.http.mall.AddUserAddress addUserAddress = new com.meiji.biz.request.http.mall.AddUserAddress()
    @Test(description = "新增收货地址 addUserAddress" ,groups = ["prod","uat"],testName = "addUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addUserAddress(TestContext testContext){
        addUserAddress.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

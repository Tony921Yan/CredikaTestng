package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateUserAddressTest extends BaseTest {
    com.meiji.biz.request.http.mall.UpdateUserAddress updateUserAddress = new com.meiji.biz.request.http.mall.UpdateUserAddress()
    @Test(description = "更新收货地址 updateUserAddress" ,groups = ["prod","uat"],testName = "updateUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateUserAddress(TestContext testContext){
        updateUserAddress.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

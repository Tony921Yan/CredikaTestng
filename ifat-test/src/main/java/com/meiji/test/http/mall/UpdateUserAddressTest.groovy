package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.UpdateUserAddress
import org.testng.annotations.Test

class UpdateUserAddressTest extends BaseTest {
    UpdateUserAddress updateUserAddress = new UpdateUserAddress()
    @Test(description = "更新收货地址 updateUserAddress" ,groups = ["prod","uat"],testName = "updateUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateUserAddress(TestContext testContext){
        updateUserAddress.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

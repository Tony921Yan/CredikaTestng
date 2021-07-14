package com.meiji.test.http.mall.userAddress

import com.meiji.biz.request.http.mall.userAddress.UpdateUserAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateUserAddressTest extends BaseTest {
    UpdateUserAddress updateUserAddress = new UpdateUserAddress()
    @Test(description = "更新收货地址 updateUserAddress" ,groups = ["prod","uat"],testName = "updateUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateUserAddress(TestContext testContext){
        updateUserAddress.invoke(testContext).baseAssert(testContext)
    }
}

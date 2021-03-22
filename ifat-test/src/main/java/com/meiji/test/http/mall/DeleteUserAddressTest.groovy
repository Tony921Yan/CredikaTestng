package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.DeleteUserAddress
import org.testng.annotations.Test

class DeleteUserAddressTest extends BaseTest {
    DeleteUserAddress deleteUserAddress = new DeleteUserAddress()
    @Test(description = "删除收货地址 deleteUserAddress" ,groups = ["prod","uat"],testName = "deleteUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteUserAddress(TestContext testContext){
        deleteUserAddress.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

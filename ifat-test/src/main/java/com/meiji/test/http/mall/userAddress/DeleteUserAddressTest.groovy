package com.meiji.test.http.mall.userAddress

import com.meiji.biz.request.http.mall.userAddress.AddUserAddress
import com.meiji.biz.request.http.mall.userAddress.DeleteUserAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteUserAddressTest extends BaseTest {
    AddUserAddress addUserAddress = new AddUserAddress()
    DeleteUserAddress deleteUserAddress = new DeleteUserAddress()
    @Test(description = "删除收货地址 deleteUserAddress" ,groups = ["prod","uat"],testName = "deleteUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteUserAddress(TestContext testContext){
        addUserAddress.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        deleteUserAddress.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

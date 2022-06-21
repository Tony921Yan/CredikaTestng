package com.meiji.test.http.mall.userAddress

import com.meiji.biz.request.http.mall.userAddress.AddUserAddress
import com.meiji.biz.request.http.mall.userAddress.DeleteUserAddress
import com.meiji.biz.request.http.mall.userAddress.UpdateUserAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateUserAddressTest extends BaseTest {
    //利用更新接口请求的sql和查询接口返回值做断言
    AddUserAddress addUserAddress = new AddUserAddress()
    DeleteUserAddress deleteUserAddress = new DeleteUserAddress()
    UpdateUserAddress updateUserAddress = new UpdateUserAddress()
    @Test(description = "更新收货地址 updateUserAddress" ,groups = ["prod","uat"],testName = "updateUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateUserAddress(TestContext testContext){
        addUserAddress.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        testContext.putAll(TestData.getTestData("userAddressNew"))
        updateUserAddress.invoke(testContext).baseAssert(testContext)
        updateUserAddress.specialAssert(testContext)
        //防止数据太多更新完删除
        deleteUserAddress.invoke(testContext).baseAssert(testContext)
    }
}

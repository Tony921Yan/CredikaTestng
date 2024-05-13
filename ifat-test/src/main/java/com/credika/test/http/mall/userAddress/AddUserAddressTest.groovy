package com.credika.test.http.mall.userAddress

import com.credika.biz.request.http.mall.userAddress.AddUserAddress
import com.credika.biz.request.http.mall.userAddress.DeleteUserAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddUserAddressTest extends BaseTest {
    AddUserAddress addUserAddress = new AddUserAddress()
    DeleteUserAddress deleteUserAddress = new DeleteUserAddress()
    @Test(description = "新增收货地址 addUserAddress" ,groups = ["prod","uat"],testName = "addUserAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addUserAddress(TestContext testContext){
        addUserAddress.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        addUserAddress.specialAssert(testContext)
        //防止数据太多添加完删除
        deleteUserAddress.invoke(testContext).baseAssert(testContext)
    }
}

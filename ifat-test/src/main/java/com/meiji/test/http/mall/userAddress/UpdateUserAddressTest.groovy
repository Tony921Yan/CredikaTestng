package com.meiji.test.http.mall.userAddress

import com.meiji.biz.request.http.mall.userAddress.FindUserAddressList
import com.meiji.biz.request.http.mall.userAddress.UpdateUserAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateUserAddressTest extends BaseTest {
    //利用更新接口请求的sql和查询接口返回值做断言
    UpdateUserAddress updateUserAddress = new UpdateUserAddress()
    FindUserAddressList findUserAddressList = new FindUserAddressList()
    @Test(description = "更新收货地址 updateUserAddress" ,groups = ["prod","uat"],testName = "updateUserAddress1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateUserAddress(TestContext testContext){
        updateUserAddress.invoke(testContext).baseAssert(testContext)
        findUserAddressList.invoke(testContext).baseAssert(testContext)
//        updateUserAddress.specialAssert(testContext)
    }

}

package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.FindUserAddressList
import org.testng.annotations.Test

class FindUserAddressListTest extends BaseTest {
    FindUserAddressList findUserAddressList = new FindUserAddressList()
    @Test(description = "查询收货地址列表 findUserAddressList" ,groups = ["prod","uat"],testName = "findUserAddressList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findUserAddressList(TestContext testContext){
        findUserAddressList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

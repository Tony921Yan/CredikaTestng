package com.meiji.test.http.mall.userAddress

import com.meiji.biz.request.http.mall.userAddress.FindUserAddressList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindUserAddressListTest extends BaseTest {
    FindUserAddressList findUserAddressList = new FindUserAddressList()
    @Test(description = "查询收货地址列表 findUserAddressList" ,groups = ["prod","uat"],testName = "findUserAddressList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findUserAddressList(TestContext testContext){
        findUserAddressList.invoke(testContext).baseAssert(testContext)
    }
}

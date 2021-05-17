package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindUserAddressListTest extends BaseTest {
    com.meiji.biz.request.http.mall.FindUserAddressList findUserAddressList = new com.meiji.biz.request.http.mall.FindUserAddressList()
    @Test(description = "查询收货地址列表 findUserAddressList" ,groups = ["prod","uat"],testName = "findUserAddressList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findUserAddressList(TestContext testContext){
        findUserAddressList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

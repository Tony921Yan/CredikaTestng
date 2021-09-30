package com.meiji.test.http.platform.other


import com.meiji.biz.request.http.platform.other.ShopManage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ShopManageTest extends BaseTest {
    ShopManage shopManage = new ShopManage()
    @Test(description = "店铺管理 shopManage" ,groups = ["prod","uat"],testName = "shopManage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void shopManage(TestContext testContext){
        shopManage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

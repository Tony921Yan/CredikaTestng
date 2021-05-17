package com.meiji.test.http.shop

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.DeleteShopModule
import org.testng.annotations.Test

class DeleteShopModuleTest extends BaseTest {
    DeleteShopModule deleteShopModule = new DeleteShopModule()
    @Test(description = "删除店铺首页模块 deleteShopModule" ,groups = ["prod","uat"],testName = "deleteShopModule",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteShopModule(TestContext testContext){
        deleteShopModule.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

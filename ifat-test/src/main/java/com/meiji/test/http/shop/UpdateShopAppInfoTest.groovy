package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.UpdateShopAppInfo
import org.testng.annotations.Test

class UpdateShopAppInfoTest extends BaseTest {
    UpdateShopAppInfo updateShopAppInfo = new  UpdateShopAppInfo()
    @Test(description = "更新店铺小程序信息 updateShopAppInfo" ,groups = ["prod","uat"],testName = "updateShopAppInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopAppInfo(TestContext testContext){
        updateShopAppInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.UpdateShopManagerInfo
import org.testng.annotations.Test

class UpdateShopManagerInfoTest extends BaseTest {
    UpdateShopManagerInfo updateShopManagerInfo = new UpdateShopManagerInfo()
    @Test(description = "更新店铺经营者信息 updateShopManagerInfo" ,groups = ["prod","uat"],testName = "updateShopManagerInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopManagerInfo(TestContext testContext){
        updateShopManagerInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

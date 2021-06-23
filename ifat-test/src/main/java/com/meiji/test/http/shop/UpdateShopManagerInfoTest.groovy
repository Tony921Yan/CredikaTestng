package com.meiji.test.http.shop

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.UpdateShopManagerInfo
import org.testng.annotations.Test

class UpdateShopManagerInfoTest extends BaseTest {
    UpdateShopManagerInfo updateShopManagerInfo = new UpdateShopManagerInfo()
    @Test(description = "更新店铺经营者信息 updateShopManagerInfo" ,groups = ["prod","uat"],testName = "updateShopManagerInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopManagerInfo(TestContext testContext){
        updateShopManagerInfo.invoke(testContext).baseAssert(testContext)
    }
}

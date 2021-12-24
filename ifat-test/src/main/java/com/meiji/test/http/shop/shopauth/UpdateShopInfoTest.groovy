package com.meiji.test.http.shop.shopauth

import com.meiji.biz.request.http.shop.shopauth.UpdateShopInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateShopInfoTest extends BaseTest {
    UpdateShopInfo updateShopInfo = new UpdateShopInfo()
    @Test(description = "更新店铺信息 updateShopInfo" ,groups = ["prod","uat"],testName = "updateShopInfo1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopInfo(TestContext testContext){
        updateShopInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

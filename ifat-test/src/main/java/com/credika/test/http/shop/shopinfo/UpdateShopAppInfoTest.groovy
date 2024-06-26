package com.credika.test.http.shop.shopinfo

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.shop.shopinfo.UpdateShopAppInfo
import org.testng.annotations.Test

class UpdateShopAppInfoTest extends BaseTest {
    UpdateShopAppInfo updateShopAppInfo = new  UpdateShopAppInfo()
    @Test(description = "更新店铺小程序信息 updateShopAppInfo" ,groups = ["prod","uat"],testName = "updateShopAppInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopAppInfo(TestContext testContext){
        updateShopAppInfo.invoke(testContext).baseAssert(testContext)
    }
}

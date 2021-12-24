package com.meiji.test.http.mall.userShop


import com.meiji.biz.request.http.mall.userShop.UpdateShopInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/12/23-16:50
 @version v2.3
 */
class UpdateShopInfoTest extends BaseTest{
    UpdateShopInfo updateShopInfo = new UpdateShopInfo()
    @Test(description = "更新店铺数据 updateShopInfo" ,groups = ["prod","uat"],testName = "updateShopInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopInfo(TestContext testContext){
        updateShopInfo.invoke(testContext).baseAssert(testContext)
    }
}

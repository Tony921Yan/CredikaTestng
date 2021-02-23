package com.meiji.test.api.goods

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.goods.UpdateGoodsPic
import org.testng.annotations.Test

class UpdateGoodsPicTest extends BaseTest {
    UpdateGoodsPic updateGoodsPic = new UpdateGoodsPic()
    @Test(description = "更新商品 updateGoods_pic" ,groups = ["prod","uat"],testName = "updateGoodsPic",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateGoodsPic(TestContext testContext){
        updateGoodsPic.invoke(testContext)
    }
}

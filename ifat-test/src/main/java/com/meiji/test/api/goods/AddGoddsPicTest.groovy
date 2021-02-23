package com.meiji.test.api.goods

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.goods.AddGoodsPic
import org.testng.annotations.Test

class AddGoddsPicTest extends BaseTest {
    AddGoodsPic addGoodsPic = new AddGoodsPic()
    @Test(description = "添加商品—pic" ,groups = ["prod","uat"],testName = "addGoodsPic",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoodsPic(TestContext testContext){

        addGoodsPic.invoke(testContext)
    }
}

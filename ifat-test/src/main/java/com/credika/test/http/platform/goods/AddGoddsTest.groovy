package com.credika.test.http.platform.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.goods.AddGoods
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/3/6-17:50
 @update 2021/11/25-17:50
 @version v2.2
 */
class AddGoddsTest extends BaseTest {
    AddGoods addGoods = new AddGoods()
    @Test(description = "添加商品 addGoods" ,groups = ["prod","uat"],testName = "addGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        addGoods.invoke(testContext).baseAssert(testContext)
    }
}

package com.meiji.test.http.shop.shopinfo

import com.meiji.biz.request.http.shop.shopinfo.Goods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GoodsTest extends BaseTest {
    Goods goods = new Goods()
    @Test(description = "店铺数据统计-商品数据) goods" ,groups = ["prod","uat"],testName = "goods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goods(TestContext testContext){
        goods.invoke(testContext).baseAssert(testContext)
    }
}

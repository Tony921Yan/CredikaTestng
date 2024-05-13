package com.credika.test.http.mall.groupBuy
import com.credika.biz.request.http.mall.groupBuy.GetGroupBuyGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGroupBuyGoodsTest extends BaseTest {
    GetGroupBuyGoods getGroupBuyGoods = new GetGroupBuyGoods()
    @Test(description = "获取拼团商品列表 getGroupBuyGoods" ,groups = ["prod","uat"],testName = "getGroupBuyGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGroupBuyGoods(TestContext testContext){
        getGroupBuyGoods.invoke(testContext).baseAssert(testContext)
    }
}
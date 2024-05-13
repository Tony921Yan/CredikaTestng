package com.credika.test.http.mall.groupBuy
import com.credika.biz.request.http.mall.groupBuy.GetGroupBuyTopGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGroupBuyTopGoodsTest extends BaseTest {
    GetGroupBuyTopGoods getGroupBuyTopGoods = new GetGroupBuyTopGoods()
    @Test(description = "查询首页三个拼团商品 getGroupBuyTopGoods" ,groups = ["prod","uat"],testName = "getGroupBuyTopGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGroupBuyTopGoods(TestContext testContext){
        getGroupBuyTopGoods.invoke(testContext).baseAssert(testContext)
    }
}
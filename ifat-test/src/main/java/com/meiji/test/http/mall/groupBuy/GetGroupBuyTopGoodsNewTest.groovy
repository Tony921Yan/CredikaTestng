package com.meiji.test.http.mall.groupBuy
import com.meiji.biz.request.http.mall.groupBuy.GetGroupBuyTopGoodsNew
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGroupBuyTopGoodsNewTest extends BaseTest {
    GetGroupBuyTopGoodsNew getGroupBuyTopGoodsNew = new GetGroupBuyTopGoodsNew()
    @Test(description = " GetGroupBuyTopGoodsNew 首页三个拼团商品(根据活动id查询)" ,groups = ["prod","uat"],testName = "getGroupBuyTopGoodsNew",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getGroupBuyTopGoodsNew(TestContext testContext){
        getGroupBuyTopGoodsNew.invoke(testContext).baseAssert(testContext)
    }
}
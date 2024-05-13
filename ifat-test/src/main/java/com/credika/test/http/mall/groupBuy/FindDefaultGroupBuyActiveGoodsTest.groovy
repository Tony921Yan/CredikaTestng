package com.credika.test.http.mall.groupBuy


import com.credika.biz.request.http.mall.groupBuy.FindDefaultGroupBuyActiveGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindDefaultGroupBuyActiveGoodsTest extends BaseTest {
    FindDefaultGroupBuyActiveGoods findDefaultGroupBuyActiveGoods = new FindDefaultGroupBuyActiveGoods()
    @Test(description = "首页获取群友内购活动三个商品 findDefaultGroupBuyActiveGoods" ,groups = ["prod","uat"],testName = "findDefaultGroupBuyActiveGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findDefaultGroupBuyActiveGoods(TestContext testContext){
        findDefaultGroupBuyActiveGoods.invoke(testContext).baseAssert(testContext)
    }
}
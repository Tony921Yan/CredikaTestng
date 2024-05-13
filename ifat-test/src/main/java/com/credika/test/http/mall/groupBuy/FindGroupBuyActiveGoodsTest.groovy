package com.credika.test.http.mall.groupBuy

import com.credika.biz.request.http.mall.groupBuy.FindGroupBuyActiveGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindGroupBuyActiveGoodsTest extends BaseTest {
    FindGroupBuyActiveGoods findGroupBuyActiveGoods = new FindGroupBuyActiveGoods()
    @Test(description = "查询群友内购活动商品列表 findGroupBuyActiveGoods" ,groups = ["prod","uat"],testName = "findGroupBuyActiveGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findGroupBuyActiveGoods(TestContext testContext){
        findGroupBuyActiveGoods.invoke(testContext).baseAssert(testContext)
    }
}
package com.credika.test.http.mall.groupBuy

import com.credika.biz.request.http.mall.groupBuy.GetGroupBuyGoods
import com.credika.biz.request.http.mall.groupBuy.GetGroupTeamByGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGroupTeamByGoodsTest extends BaseTest {
    GetGroupTeamByGoods getGroupTeamByGoods = new GetGroupTeamByGoods()
    GetGroupBuyGoods getGroupBuyGoods = new GetGroupBuyGoods()
    @Test(description = "商详内展示拼团队伍 getGroupTeamByGoods" ,groups = ["prod","uat"],testName = "getGroupTeamByGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGroupTeamByGoods(TestContext testContext){
        getGroupBuyGoods.invoke(testContext).baseAssert(testContext).afterinvoke(testContext)
        getGroupTeamByGoods.invoke(testContext).baseAssert(testContext)
    }
}
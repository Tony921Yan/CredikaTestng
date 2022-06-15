package com.meiji.test.http.mall.groupBuy
import com.meiji.biz.request.http.mall.groupBuy.GetGroupTeamByGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGroupTeamByGoodsTest extends BaseTest {
    GetGroupTeamByGoods getGroupTeamByGoods = new GetGroupTeamByGoods()
    @Test(description = "商详内展示拼团队伍 getGroupTeamByGoods" ,groups = ["prod","uat"],testName = "getGroupTeamByGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGroupTeamByGoods(TestContext testContext){
        getGroupTeamByGoods.invoke(testContext).baseAssert(testContext)
    }
}
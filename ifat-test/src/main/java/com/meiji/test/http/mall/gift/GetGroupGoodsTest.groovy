package com.meiji.test.http.mall.gift
import com.meiji.biz.request.http.mall.gift.GetGroupGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGroupGoodsTest extends BaseTest {
    GetGroupGoods getGroupGoods = new GetGroupGoods()
    @Test(description = "送礼专区-推荐礼品 getGroupGoods" ,groups = ["prod","uat"],testName = "getGroupGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getGroupGoods(TestContext testContext){
        getGroupGoods.invoke(testContext).baseAssert(testContext)
    }
}

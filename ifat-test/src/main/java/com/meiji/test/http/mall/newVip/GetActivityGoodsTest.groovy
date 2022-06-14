package com.meiji.test.http.mall.newVip


import com.meiji.biz.request.http.mall.newVip.GetActivityGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetActivityGoodsTest extends BaseTest {
    GetActivityGoods getActivityGoods = new GetActivityGoods()
    @Test(description = "查询新粉活动商品 getActivityGoods" ,groups = ["prod","uat"],testName = "getActivityGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActivityGoods(TestContext testContext){
        getActivityGoods.invoke(testContext).baseAssert(testContext)
    }
}
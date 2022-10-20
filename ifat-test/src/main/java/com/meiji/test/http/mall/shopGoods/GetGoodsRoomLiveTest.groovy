package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.GetGoodsRoomLive
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsRoomLiveTest extends BaseTest {
    GetGoodsRoomLive getGoodsRoomLive = new GetGoodsRoomLive()
    @Test(description = "商品详情直播入口 getGoodsRoomLive" ,groups = ["prod","uat"],testName = "getGoodsRoomLive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findActiveGoods(TestContext testContext){
        getGoodsRoomLive.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

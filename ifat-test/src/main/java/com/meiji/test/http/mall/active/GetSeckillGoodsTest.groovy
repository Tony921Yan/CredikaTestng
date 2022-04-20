package com.meiji.test.http.mall.active

import com.meiji.biz.request.http.mall.active.GetSeckillActiveList
import com.meiji.biz.request.http.mall.active.GetSeckillGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/04/20 10:18
 * @Vession V2.7.1
 * */
class GetSeckillGoodsTest extends BaseTest {
    GetSeckillGoods getSeckillGoods = new GetSeckillGoods()
    @Test(description = "获取秒杀商品列表 getSeckillGoods" ,groups = ["prod","uat"],testName = "getSeckillGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSeckillGoods(TestContext testContext){
        getSeckillGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取秒杀商品列表-分页 getSeckillGoods" ,groups = ["prod","uat"],testName = "getSeckillGoods1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSeckillGoods1(TestContext testContext){
        getSeckillGoods.invoke(testContext).baseAssert(testContext)
    }
}
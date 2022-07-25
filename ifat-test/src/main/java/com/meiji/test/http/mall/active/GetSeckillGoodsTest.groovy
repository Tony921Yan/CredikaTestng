package com.meiji.test.http.mall.active

import com.meiji.biz.request.http.mall.active.GetSeckillActiveList
import com.meiji.biz.request.http.mall.active.GetSeckillActivesByActId
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
//    GetSeckillActiveList getSeckillActiveList = new GetSeckillActiveList()
    GetSeckillActivesByActId getSeckillActivesByActId = new GetSeckillActivesByActId()
    @Test(description = "获取秒杀商品列表 getSeckillActivesByActId" ,groups = ["prod","uat"],testName = "getSeckillActivesByActId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSeckillActivesByActId(TestContext testContext){
        getSeckillActivesByActId.invoke(testContext).baseAssert(testContext).invoke(testContext)
        getSeckillGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取秒杀商品列表-分页 getSeckillGoods" ,groups = ["prod","uat"],testName = "getSeckillActivesByActId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSeckillGoods1(TestContext testContext){
        getSeckillActivesByActId.invoke(testContext).baseAssert(testContext).invoke(testContext)
        getSeckillGoods.invoke(testContext).baseAssert(testContext)
    }
}
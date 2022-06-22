package com.meiji.test.http.mall.active

import com.meiji.biz.request.http.mall.active.GetSeckillActiveList
import com.meiji.biz.request.http.mall.active.GetSeckillTopGoods
import com.meiji.biz.request.http.mall.active.SubscribeNotice
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/04/20 10:18
 * @Vession V2.7.1
 * */
class SubscribeNoticeTest extends BaseTest {
    SubscribeNotice subscribeNotice = new SubscribeNotice()
    GetSeckillTopGoods getSeckillTopGoods = new GetSeckillTopGoods()
    @Test(description = "订阅秒杀开始提醒 subscribeNotice" ,groups = ["prod","uat"],testName = "subscribeNotice",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void subscribeNotice(TestContext testContext){
        getSeckillTopGoods.invoke(testContext).baseAssert(testContext).afterinvoke(testContext)
        subscribeNotice.invoke(testContext).baseAssert(testContext)
    }
}
package com.credika.test.http.mall.active


import com.credika.biz.request.http.mall.active.GetSeckillActivesByActId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/07/18 23:58
 * @Vession V3.1
 * */
class GetSeckillActivesByActIdTest extends BaseTest {
    GetSeckillActivesByActId getSeckillActivesByActId = new GetSeckillActivesByActId()

    @Test(description = "入参活动id 获取抢购中/即将开始的秒杀活动 getSeckillActivesByActId", groups = ["prod", "uat"], testName = "getSeckillActivesByActId",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getSeckillActivesByActId(TestContext testContext) {
        getSeckillActivesByActId.invoke(testContext).baseAssert(testContext)
        getSeckillActivesByActId.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取会员秒杀 getSeckillActivesByActId" ,groups = ["prod","uat"],testName = "getSeckillActivesByActId-vip",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSeckillActivesByActId1(TestContext testContext){
        getSeckillActivesByActId.invoke(testContext).baseAssert(testContext)

   }


}
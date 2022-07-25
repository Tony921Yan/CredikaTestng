package com.meiji.test.http.mall.active

import com.meiji.biz.request.http.mall.active.GetSeckillActiveList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/04/20 10:18
 * @Vession V2.7.1
 * */
class GetSeckillActiveListTest extends BaseTest { //此接口已废弃，用GetSeckillActivesByActIdTest代替
    GetSeckillActiveList getSeckillActiveList = new GetSeckillActiveList()
    @Test(description = "获取抢购中/即将开始的秒杀活动 getSeckillActiveList" ,groups = ["prod","uat"],testName = "getSeckillActiveList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSeckillActiveList(TestContext testContext){
//        getSeckillActiveList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
        getSeckillActiveList.invoke(testContext).baseAssert(testContext)
    }
}
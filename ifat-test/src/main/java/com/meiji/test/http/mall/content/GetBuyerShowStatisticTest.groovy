package com.meiji.test.http.mall.content

import com.meiji.biz.request.http.mall.content.GetBuyerShowStatistic
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/07 14:36
 * @Vession V2.5
 */
class GetBuyerShowStatisticTest extends BaseTest{
    GetBuyerShowStatistic getBuyerShowStatistic = new GetBuyerShowStatistic()
    @Test(description = "我发布的晒单列表统计数据 getBuyerShowStatistic",groups = ["uat","prod"],testName = "getBuyerShowStatistic",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getBuyerShowStatistic(TestContext testContext){
        getBuyerShowStatistic.invoke(testContext).baseAssert(testContext)
    }
}

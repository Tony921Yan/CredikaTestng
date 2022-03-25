package com.meiji.test.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.raffleActivity.StockIncrBy
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class StockIncrByTest extends BaseTest {
    StockIncrBy stockIncrBy = new StockIncrBy()
    @Test(description = "抽奖奖增加库存数量 优惠券 stockIncrBy" ,groups = ["prod","uat"],testName = "stockIncrBy",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void stockIncrBy(TestContext testContext){
        stockIncrBy.invoke(testContext).baseAssert(testContext)
    }
}
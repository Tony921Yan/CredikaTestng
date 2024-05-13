package com.credika.test.http.platform.raffleActivity
import com.credika.biz.request.http.platform.raffleActivity.StockDecrBy
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class StockDecrByTest extends BaseTest {
    StockDecrBy stockDecrBy = new StockDecrBy()
    @Test(description = "释放库存数量 优惠券 stockDecrBy" ,groups = ["prod","uat"],testName = "stockDecrBy",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void stockDecrBy(TestContext testContext){
        stockDecrBy.invoke(testContext).baseAssert(testContext)
    }
}
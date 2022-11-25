package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.CheckSpusIsOnlyGift
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CheckSpusIsOnlyGiftTest extends BaseTest {
    CheckSpusIsOnlyGift checkSpusIsOnlyGift = new CheckSpusIsOnlyGift()
    @Test(description = "查询商品里是否存在只支持送礼 checkSpusIsOnlyGift" ,groups = ["prod","uat"],testName = "checkSpusIsOnlyGift",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void findActiveGoods(TestContext testContext){
        checkSpusIsOnlyGift.invoke(testContext).baseAssert(testContext)
    }
}

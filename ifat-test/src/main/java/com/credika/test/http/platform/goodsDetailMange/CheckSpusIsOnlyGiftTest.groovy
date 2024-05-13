package com.credika.test.http.platform.goodsDetailMange

import com.credika.biz.request.http.platform.goodsDetailManage.CheckSpusIsOnlyGift
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CheckSpusIsOnlyGiftTest extends BaseTest {
    CheckSpusIsOnlyGift checkSpusIsOnlyGift = new CheckSpusIsOnlyGift()
    @Test(description = "商品是否能设置只支持送礼" ,groups = ["prod","uat"],testName = "checkSpusIsOnlyGift",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void addRecord(TestContext testContext){
        checkSpusIsOnlyGift.invoke(testContext).baseAssert(testContext)
    }

}

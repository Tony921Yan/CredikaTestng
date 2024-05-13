package com.credika.test.http.mall.orderExhibit

import com.credika.biz.request.http.mall.orderExhibit.PublishBuyerShowAndDeleteBuyeShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/08 9:44
 * @Vession V2.5
 */
class PublishBuyerShowAndDeleteBuyeShowTest extends BaseTest{
    PublishBuyerShowAndDeleteBuyeShow publishBuyerShowAndDeleteBuyeShow = new PublishBuyerShowAndDeleteBuyeShow()
    @Test(description = "新增订单晒单再删除晒单 publishBuyerShowAndDeleteBuyeShow",groups = ["uat","prod"],testName = "publishBuyerShowAndDeleteBuyeShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void publishBuyerShowAndDeleteBuyeShow(TestContext testContext){
        publishBuyerShowAndDeleteBuyeShow.invoke(testContext).baseAssert(testContext)
    }
}

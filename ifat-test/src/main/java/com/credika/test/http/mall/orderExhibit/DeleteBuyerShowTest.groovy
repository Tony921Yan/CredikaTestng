package com.credika.test.http.mall.orderExhibit

import com.credika.biz.request.http.mall.orderExhibit.DeleteBuyerShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy*
 * @date 2022/01/06 22:38
 * @Vession V2.4
 */
class DeleteBuyerShowTest extends BaseTest{
//    PublishWithoutOrder publishWithoutOrder = new PublishWithoutOrder()
    DeleteBuyerShow deleteBuyerShow = new DeleteBuyerShow()
    @Test(description = "删除晒单 deleteBuyerShow",groups = ["prod","uat"],testName = "publishWithoutOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteBuyerShow(TestContext testContext){
//        publishWithoutOrder.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        deleteBuyerShow.preInvoke(testContext).invoke(testContext).baseAssert(testContext)
    }
}

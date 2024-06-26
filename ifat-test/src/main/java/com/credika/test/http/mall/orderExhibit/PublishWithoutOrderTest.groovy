package com.credika.test.http.mall.orderExhibit

import com.credika.biz.request.http.mall.orderExhibit.PublishWithoutOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/01/06 22:38
 * @Vession V2.4
 */
class PublishWithoutOrderTest extends BaseTest{
    PublishWithoutOrder publishWithoutOrder = new PublishWithoutOrder()
    @Test(description = "未购买发布晒单/编辑晒单 publishWithoutOrder",groups = ["prod","uat"],testName = "publishWithoutOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void publishWithoutOrder(TestContext testContext){
        publishWithoutOrder.invoke(testContext).baseAssert(testContext)
    }
}

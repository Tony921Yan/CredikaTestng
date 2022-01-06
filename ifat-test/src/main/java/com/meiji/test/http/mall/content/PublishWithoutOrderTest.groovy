package com.meiji.test.http.mall.content

import com.meiji.biz.request.http.mall.content.PublishWithoutOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy* @date 2022/01/06 22:38
 * @Vession V2.4
 */
class PublishWithoutOrderTest extends BaseTest{
    PublishWithoutOrder publishWithoutOrder = new PublishWithoutOrder()
    @Test(description = "未购买发布晒单 publishWithoutOrder",groups = ["prod","uat"],testName = "publishWithoutOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void publishWithoutOrder(TestContext testContext){
        publishWithoutOrder.invoke(testContext).baseAssert(testContext)
        Map map = testContext.getResponse().data
        String id = map.get("showId")
        System.out.println(id)
    }
}

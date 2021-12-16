package com.meiji.test.http.mall.material

import com.meiji.biz.request.http.mall.material.NewListBuyerShowOfMe
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/16 23:32
 @version v2.3
 */
class NewListBuyerShowOfMeTest extends BaseTest {
    NewListBuyerShowOfMe newListBuyerShowOfMe = new NewListBuyerShowOfMe();
    @Test(description = "我发布的 newListBuyerShowOfMe" ,groups = ["prod","uat"],testName = "newListBuyerShowOfMe",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void newListBuyerShowOfMe(TestContext testContext){
        newListBuyerShowOfMe.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我发布的 newListBuyerShowOfMe" ,groups = ["prod","uat"],testName = "newListBuyerShowOfMe2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void newListBuyerShowOfMe2(TestContext testContext){
        newListBuyerShowOfMe.invoke(testContext).baseAssert(testContext)
    }
}

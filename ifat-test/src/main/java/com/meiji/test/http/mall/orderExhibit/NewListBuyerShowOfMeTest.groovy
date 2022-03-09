package com.meiji.test.http.mall.orderExhibit

import com.meiji.biz.request.http.mall.orderExhibit.NewListBuyerShowOfMe
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

    @Test(description = "我发布的-制作中 newListBuyerShowOfMe" ,groups = ["prod","uat"],testName = "newListBuyerShowOfMe2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void newListBuyerShowOfMe2(TestContext testContext){
        newListBuyerShowOfMe.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我发布的-待审核 newListBuyerShowOfMe" ,groups = ["prod","uat"],testName = "newListBuyerShowOfMe3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void newListBuyerShowOfMe3(TestContext testContext){
        newListBuyerShowOfMe.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我发布的-待修改 newListBuyerShowOfMe" ,groups = ["prod","uat"],testName = "newListBuyerShowOfMe4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void newListBuyerShowOfMe4(TestContext testContext){
        newListBuyerShowOfMe.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我发布的-已发布 newListBuyerShowOfMe" ,groups = ["prod","uat"],testName = "newListBuyerShowOfMe5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void newListBuyerShowOfMe5(TestContext testContext){
        newListBuyerShowOfMe.invoke(testContext).baseAssert(testContext)
    }
}

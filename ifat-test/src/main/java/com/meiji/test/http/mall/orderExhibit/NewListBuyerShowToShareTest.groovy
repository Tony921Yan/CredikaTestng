package com.meiji.test.http.mall.orderExhibit

import com.meiji.biz.request.http.mall.orderExhibit.NewListBuyerShowToShare
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/16 22:32
 @version v2.3
 */
class NewListBuyerShowToShareTest extends BaseTest {
    NewListBuyerShowToShare newListBuyerShowToShare = new NewListBuyerShowToShare()
    @Test(description = "查询晒单详情 newListBuyerShowToShare" ,groups = ["prod","uat"],testName = "newListBuyerShowToShare",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void newListBuyerShowToShare(TestContext testContext){
        newListBuyerShowToShare.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询晒单详情-第2页 newListBuyerShowToShare" ,groups = ["prod","uat"],testName = "newListBuyerShowToShare2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void newListBuyerShowToShare2(TestContext testContext){
        newListBuyerShowToShare.invoke(testContext).baseAssert(testContext)
    }
}

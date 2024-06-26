package com.credika.test.http.mall.orderExhibit

import com.credika.biz.request.http.mall.orderExhibit.ListBuyerShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/13 09:17
 @version v2.3
 */
class ListBuyerShowTest extends BaseTest {
    ListBuyerShow listBuyerShow = new ListBuyerShow()
    @Test(description = "晒单列表第1页 listBuyerShow" ,groups = ["prod","uat"],testName = "listBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listBuyerShow(TestContext testContext){
        listBuyerShow.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "晒单列表第2页 listBuyerShow" ,groups = ["prod","uat"],testName = "listBuyerShow2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listBuyerShow2(TestContext testContext){
        listBuyerShow.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "晒单列表第3页 listBuyerShow" ,groups = ["prod","uat"],testName = "listBuyerShow3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listBuyerShow3(TestContext testContext){
        listBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}

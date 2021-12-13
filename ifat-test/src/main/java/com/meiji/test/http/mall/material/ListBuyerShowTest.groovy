package com.meiji.test.http.mall.material

import com.meiji.biz.request.http.mall.material.ListBuyerShow
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
    @Test(description = "晒单列表 listBuyerShow" ,groups = ["prod","uat"],testName = "listBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listBuyerShow(TestContext testContext){
        listBuyerShow.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "晒单列表 listBuyerShow" ,groups = ["prod","uat"],testName = "listBuyerShow2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listBuyerShow2(TestContext testContext){
        listBuyerShow.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "晒单列表 listBuyerShow" ,groups = ["prod","uat"],testName = "listBuyerShow3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listBuyerShow3(TestContext testContext){
        listBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}

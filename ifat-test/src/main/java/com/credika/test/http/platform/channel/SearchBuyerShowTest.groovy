package com.credika.test.http.platform.channel
import com.credika.biz.request.http.platform.channel.SearchBuyerShow
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class SearchBuyerShowTest extends BaseTest {
    SearchBuyerShow searchBuyerShow = new SearchBuyerShow();
    @Test(description = "商品管理-频道管理-晒单列表-来源类型-运营 searchBuyerShow" ,groups = ["prod","uat"],testName = "searchBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchBuyerShow(TestContext testContext){
        testContext.put("contentSource",1)
        testContext.put("columnId", MysqlService.searchBuyerShow())
        searchBuyerShow.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品管理-频道管理-晒单列表-来源类型-用户 searchBuyerShow" ,groups = ["prod","uat"],testName = "searchBuyerShow01",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchBuyerShow01(TestContext testContext){
        testContext.put("contentSource",2)
        testContext.put("columnId", MysqlService.searchBuyerShow())
        searchBuyerShow.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品管理-频道管理-晒单列表-来源类型-OMS searchBuyerShow" ,groups = ["prod","uat"],testName = "searchBuyerShow02",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchBuyerShow02(TestContext testContext){
        testContext.put("contentSource",3)
        testContext.put("columnId", MysqlService.searchBuyerShow())
        searchBuyerShow.invoke(testContext).baseAssert(testContext)
    }



}
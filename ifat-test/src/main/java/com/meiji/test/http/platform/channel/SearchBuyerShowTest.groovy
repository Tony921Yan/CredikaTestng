package com.meiji.test.http.platform.channel

import com.meiji.biz.request.http.platform.channel.GetGoods
import com.meiji.biz.request.http.platform.channel.SearchBuyerShow
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
    @Test(description = "商品管理-频道管理-晒单列表 searchBuyerShow" ,groups = ["prod","uat"],testName = "searchBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchBuyerShow(TestContext testContext){
        searchBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}

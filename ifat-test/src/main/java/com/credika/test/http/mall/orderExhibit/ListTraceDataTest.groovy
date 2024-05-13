package com.credika.test.http.mall.orderExhibit

import com.credika.biz.request.http.mall.orderExhibit.ListTraceData
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class ListTraceDataTest extends BaseTest {
    ListTraceData listTraceData = new ListTraceData()
    @Test(description = "查询埋点数据 listTraceData" ,groups = ["prod","uat"],testName = "listTraceData",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listTraceData(TestContext testContext){
        listTraceData.invoke(testContext).baseAssert(testContext)
    }
}

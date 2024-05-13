package com.credika.test.http.platform.channel


import com.credika.biz.request.http.platform.channel.GetColumnList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/11/18-17:50
 @version v2.1
 */
class GetColumnListTest extends BaseTest {
    GetColumnList getColumnList = new GetColumnList()
    @Test(description = "商品管理-频道管理-栏目（货比三家） getColumnList" ,groups = ["prod","uat"],testName = "getColumnList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnList(TestContext testContext){
        getColumnList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品管理-频道管理-栏目（晒单） getColumnList" ,groups = ["prod","uat"],testName = "getColumnList1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnList1(TestContext testContext){
        getColumnList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品管理-频道管理-栏目（美记精选） getColumnList" ,groups = ["prod","uat"],testName = "getColumnList2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnList2(TestContext testContext){
        getColumnList.invoke(testContext).baseAssert(testContext)
    }
}

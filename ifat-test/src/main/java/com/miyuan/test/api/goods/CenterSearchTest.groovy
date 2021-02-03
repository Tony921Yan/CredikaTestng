package com.miyuan.test.api.goods

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.goods.CenterSearch
import org.testng.annotations.Test 

class CenterSearchTest extends BaseTest{
    CenterSearch centerSearch = new CenterSearch()
    @Test(description = "搜索-淘宝" ,groups = ["prod","uat"],testName = "centerSearchSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerSearchSuccess(TestContext testContext){
        centerSearch.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索-京东" ,groups = ["prod","uat"],testName = "centerSearchItemSource2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerSearchItemSource2(TestContext testContext){
        centerSearch.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索-唯品会" ,groups = ["prod","uat"],testName = "centerSearchItemSource3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerSearchItemSource3(TestContext testContext){
        centerSearch.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索-考拉" ,groups = ["prod","uat"],testName = "centerSearchItemSource4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerSearchItemSource4(TestContext testContext){
        centerSearch.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索-拼多多" ,groups = ["prod","uat"],testName = "centerSearchItemSource5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerSearchItemSource5(TestContext testContext){
        centerSearch.invoke(testContext).baseAssert(testContext)
    }
}



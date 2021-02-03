package com.miyuan.test.api.user

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.user.FansGetFans
import org.testng.annotations.Test

class FansGetFansTest extends BaseTest{
    FansGetFans fansGetFans = new FansGetFans()
    @Test(description = "我的粉丝列表" ,groups = ["prod","uat"],testName = "fansGetFansSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess(TestContext testContext){
        fansGetFans.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我的粉丝列表" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_page2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_page2(TestContext testContext){
        fansGetFans.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我的粉丝列表-有效粉丝" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_filterType1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_filterType1(TestContext testContext){
        fansGetFans.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我的粉丝列表-无效粉丝" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_filterType2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_filterType2(TestContext testContext){
        fansGetFans.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我的粉丝列表-已授权" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_filterType3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_filterType3(TestContext testContext){
        fansGetFans.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我的粉丝列表-未授权" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_filterType3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_filterType4(TestContext testContext){
        fansGetFans.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "我的粉丝列表错误token" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_tokenError",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_tokenError(TestContext testContext){
        fansGetFans.invoke(testContext)
        assert testContext.getResponse().code == "B10019"
    }
}

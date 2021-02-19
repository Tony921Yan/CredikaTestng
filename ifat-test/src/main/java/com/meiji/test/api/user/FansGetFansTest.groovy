package com.meiji.test.api.user

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import org.testng.annotations.Test

class FansGetFansTest extends BaseTest{
    @Test(description = "我的粉丝列表" ,groups = ["prod","uat"],testName = "fansGetFansSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess(TestContext testContext){

    }

    @Test(description = "我的粉丝列表" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_page2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_page2(TestContext testContext){

    }

    @Test(description = "我的粉丝列表-有效粉丝" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_filterType1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_filterType1(TestContext testContext){

    }

    @Test(description = "我的粉丝列表-无效粉丝" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_filterType2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_filterType2(TestContext testContext){

    }

    @Test(description = "我的粉丝列表-已授权" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_filterType3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_filterType3(TestContext testContext){

    }

    @Test(description = "我的粉丝列表-未授权" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_filterType3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_filterType4(TestContext testContext){

    }

    @Test(description = "我的粉丝列表错误token" ,groups = ["prod","uat"],testName = "fansGetFansSuccess_tokenError",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fansGetFansSuccess_tokenError(TestContext testContext){
        assert testContext.getResponse().code == "B10019"
    }
}

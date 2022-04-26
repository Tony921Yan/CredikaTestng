package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.Detail
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DetailTest extends BaseTest {
    Detail detail = new Detail()
    @Test(description = "活动详情-领券活动 detail" ,groups = ["prod","uat"],testName = "activeMainManage.detail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void detail(TestContext testContext){
        detail.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动管理-秒杀活动-活动详情 detail" ,groups = ["prod","uat"],testName = "activeMainManage.detail1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void detail1(TestContext testContext){
        testContext.put("id",MysqlService.getNewestID())
        detail.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动详情-粉丝专享 detail" ,groups = ["prod","uat"],testName = "activeMainManage.detail2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void detail2(TestContext testContext){
        detail.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动详情-店长拉新 detail" ,groups = ["prod","uat"],testName = "activeMainManage.detail3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void detail3(TestContext testContext){
        detail.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动详情-抽奖活动 detail" ,groups = ["prod","uat"],testName = "activeMainManage.detail4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void detail4(TestContext testContext){
        detail.invoke(testContext).baseAssert(testContext)
    }

    /*@Test(description = "活动详情-粉丝新人券 detail" ,groups = ["prod","uat"],testName = "activeMainManage.detail5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void detail5(TestContext testContext){
        detail.invoke(testContext).baseAssert(testContext)
    }*/

}
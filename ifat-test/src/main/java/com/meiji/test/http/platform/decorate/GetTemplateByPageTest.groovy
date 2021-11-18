package com.meiji.test.http.platform.decorate

import com.meiji.biz.request.http.mall.userShop.GetTemplateDefaultComponentList
import com.meiji.biz.request.http.platform.channel.GetColumnList
import com.meiji.biz.request.http.platform.decorate.GetTemplateByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-20:20
 @version v2.1
 */
class GetTemplateByPageTest extends BaseTest {
    GetTemplateByPage getTemplateByPage = new GetTemplateByPage()
    @Test(description = "装修模板管理 getTemplateByPage" ,groups = ["prod","uat"],testName = "getTemplateByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getTemplateByPage(TestContext testContext){
        getTemplateByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "装修模板管理-精确搜索 getTemplateByPage" ,groups = ["prod","uat"],testName = "getTemplateByPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getTemplateByPage1(TestContext testContext){
        getTemplateByPage.invoke(testContext).baseAssert(testContext)
    }
}

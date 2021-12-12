package com.meiji.test.http.mall.home

import com.meiji.biz.request.http.mall.userShop.GetTemplateDefaultComponentList
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
class GetTemplateComponentListTest extends BaseTest {
    GetTemplateDefaultComponentList getTemplateDefaultComponentList = new GetTemplateDefaultComponentList();
    @Test(description = "首页装修模板 getTemplateDefaultComponentList" ,groups = ["prod","uat"],testName = "getTemplateDefaultComponentList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)//无xml参数
    public void getTemplateDefaultComponentList(TestContext testContext){
        getTemplateDefaultComponentList.invoke(testContext).baseAssert(testContext)
    }
}

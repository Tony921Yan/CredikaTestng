package com.meiji.test.http.mall.userShop

import com.meiji.biz.request.http.mall.userShop.GetTemplateDefaultComponentList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/16-10:50
 @version V2.1
 */
class GetTemplateDefaultComponentListTest extends BaseTest{
    GetTemplateDefaultComponentList getTemplateDefaultComponentList = new GetTemplateDefaultComponentList()
    @Test(description = "店铺装修模板数据-查询首页数据 getTemplateDefaultComponentList" ,groups = ["prod","uat"],testName = "getTemplateDefaultComponentList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getTemplateDefaultComponentList(TestContext testContext){
        getTemplateDefaultComponentList.invoke(testContext).baseAssert(testContext)
    }
}

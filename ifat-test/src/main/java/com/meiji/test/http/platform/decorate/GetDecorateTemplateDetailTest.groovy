package com.meiji.test.http.platform.decorate

import com.meiji.biz.request.http.platform.decorate.GetDecorateTemplateDetail
import com.meiji.biz.service.MysqlService
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
class GetDecorateTemplateDetailTest extends BaseTest {
    GetDecorateTemplateDetail getDecorateTemplateDetail = new GetDecorateTemplateDetail()
    @Test(description = "首页装修模板管理界面 getDecorateTemplateDetail" ,groups = ["prod","uat"],testName = "getDecorateTemplateDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getDecorateTemplateDetail(TestContext testContext){
        testContext.put("id",MysqlService.getDecorateTemplateDetail().get(0).get("id"))
        getDecorateTemplateDetail.invoke(testContext).baseAssert(testContext)
    }
}

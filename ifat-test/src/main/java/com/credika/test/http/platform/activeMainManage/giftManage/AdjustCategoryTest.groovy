package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.AdjustCategory
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AdjustCategoryTest extends BaseTest {
    AdjustCategory adjustCategory = new AdjustCategory()
    @Test(description = "送礼管理-分类管理-送礼分类-上架" ,groups = ["prod","uat"],testName = "adjustCategory01",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void adjustCategory01(TestContext testContext){
        testContext.put("id", MysqlService.adjustCategory01().get(0))
        testContext.put("action",1)
        adjustCategory.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "送礼管理-分类管理-送礼分类-下架" ,groups = ["prod","uat"],testName = "adjustCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void adjustCategory(TestContext testContext){
        testContext.put("id", MysqlService.adjustCategory().get(0))
        testContext.put("action",0)
        adjustCategory.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "送礼管理-分类管理-送礼分类-删除" ,groups = ["prod","uat"],testName = "adjustCategory02",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void adjustCategory02(TestContext testContext){
        testContext.put("id", MysqlService.adjustCategory01().get(0))
        testContext.put("action",2)
        adjustCategory.invoke(testContext).baseAssert(testContext)
    }



}
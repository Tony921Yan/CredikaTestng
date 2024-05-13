package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.CategoryDetail
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CategoryDetailTest extends BaseTest {
    CategoryDetail categoryDetail = new CategoryDetail()
    @Test(description = "送礼管理-分类详情查询 categoryDetail" ,groups = ["prod","uat"],testName = "categoryDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void categoryDetail(TestContext testContext){
        testContext.put("id", MysqlService.CategoryDetail().get(0))
        categoryDetail.invoke(testContext).baseAssert(testContext)
    }
}
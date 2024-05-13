package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.CategoryDetail
import com.credika.biz.request.http.platform.activeMainManage.giftManage.EditCategory
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class EditCategoryTest extends BaseTest {
    CategoryDetail categoryDetail = new CategoryDetail()
    EditCategory editCategory = new EditCategory()
    @Test(description = "送礼管理-分类管理-分类编辑 editCategory" ,groups = ["prod","uat"],testName = "editCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void editCategory(TestContext testContext){
        testContext.put("id", MysqlService.CategoryDetail().get(0))
        categoryDetail.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        editCategory.invoke(testContext).baseAssert(testContext)
    }

}
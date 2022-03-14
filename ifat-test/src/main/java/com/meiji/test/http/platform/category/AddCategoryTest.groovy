package com.meiji.test.http.platform.category

import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.category.AddCategory
import org.testng.annotations.Test

class AddCategoryTest extends BaseTest {
    AddCategory addCategory = new AddCategory()
    @Test(description = "添加一级类目 addCategory" ,groups = ["prod","uat"],testName = "addCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addCategory(TestContext testContext){
        testContext.get("id", MysqlService.deleteCategory())
        addCategory.invoke(testContext).baseAssert(testContext)
    }
}

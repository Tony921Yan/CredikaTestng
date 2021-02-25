package com.meiji.test.api.category

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.category.AddCategory
import org.testng.annotations.Test

class AddCategoryTest extends BaseTest {
    AddCategory addCategory = new AddCategory()
    @Test(description = "添加类目 addCategory" ,groups = ["prod","uat"],testName = "addCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addCategory(TestContext testContext){
        addCategory.invoke(testContext).baseAssert(testContext)
    }
}

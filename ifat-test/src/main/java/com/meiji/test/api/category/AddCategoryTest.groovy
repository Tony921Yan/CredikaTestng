package com.meiji.test.api.category


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddCategoryTest extends BaseTest {
    com.meiji.biz.request.api.category.AddCategory addCategory = new com.meiji.biz.request.api.category.AddCategory()
    @Test(description = "添加类目 addCategory" ,groups = ["prod","uat"],testName = "addCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addCategory(TestContext testContext){
        addCategory.invoke(testContext).baseAssert(testContext)
    }
}

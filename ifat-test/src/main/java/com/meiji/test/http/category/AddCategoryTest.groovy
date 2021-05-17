package com.meiji.test.http.category

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.category.AddCategory
import org.testng.annotations.Test

class AddCategoryTest extends BaseTest {
    AddCategory addCategory = new AddCategory()
    @Test(description = "添加类目 addCategory" ,groups = ["prod","uat"],testName = "addCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addCategory(TestContext testContext){
        addCategory.invoke(testContext).baseAssert(testContext)
//        addCategory.dataAssert(testContext)
    }
}

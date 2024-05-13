package com.credika.test.http.platform.category

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.category.UpdateCategoryById
import org.testng.annotations.Test

class UpdateCategoryByIdTest extends BaseTest {
    UpdateCategoryById updateCategoryById = new UpdateCategoryById()
    @Test(description = "修改类目 updateCategoryById" ,groups = ["prod","uat"],testName = "updateCategoryById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateCategoryById(TestContext testContext){
        updateCategoryById.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "修改类目-list为空" ,groups = ["prod","uat"],testName = "updateCategoryById_listNull",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateCategoryById_listNull(TestContext testContext){
        updateCategoryById.invoke(testContext)
        assert testContext.getResponse().code == 10
    }
}

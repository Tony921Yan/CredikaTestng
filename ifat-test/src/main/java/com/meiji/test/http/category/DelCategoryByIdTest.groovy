package com.meiji.test.http.category

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.category.DelCategoryById
import org.testng.annotations.Test

class DelCategoryByIdTest extends BaseTest {
    DelCategoryById delCategoryById = new DelCategoryById()
    @Test(description = "删除类目 delCategoryById" ,groups = ["prod","uat"],testName = "delCategoryById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void delCategoryById(TestContext testContext){
        delCategoryById.invoke(testContext).baseAssert(testContext)
    }
}

package com.meiji.test.http.category

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.category.UpdateCategoryById
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class UpdateCategoryByIdTest extends BaseTest {
    UpdateCategoryById updateCategoryById = new UpdateCategoryById()
    @Test(description = "修改类目 updateCategoryById" ,groups = ["prod","uat"],testName = "updateCategoryById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateCategoryById(TestContext testContext){
        testContext.put("list", JsonUtil.objToJsonList(testContext.get("list")))
        updateCategoryById.invoke(testContext).baseAssert(testContext)
    }
}

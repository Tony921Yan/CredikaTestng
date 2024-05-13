package com.credika.test.api.category

import com.credika.biz.request.api.category.UpdateCategoryById
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateCategoryByIdTest extends BaseTest {
    UpdateCategoryById updateCategoryById = new UpdateCategoryById()
    @Test(description = "修改类目 updateCategoryById" ,groups = ["prod","uat"],testName = "updateCategoryById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateCategoryById(TestContext testContext){
        //testContext.put("list", JsonUtil.objToJsonList(testContext.get("list")))
        updateCategoryById.invoke(testContext).baseAssert(testContext)
    }
}

package com.meiji.test.api.category


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class UpdateCategoryByIdTest extends BaseTest {
    com.meiji.biz.request.api.category.UpdateCategoryById updateCategoryById = new com.meiji.biz.request.api.category.UpdateCategoryById()
    @Test(description = "修改类目 updateCategoryById" ,groups = ["prod","uat"],testName = "updateCategoryById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateCategoryById(TestContext testContext){
        //testContext.put("list", JsonUtil.objToJsonList(testContext.get("list")))
        updateCategoryById.invoke(testContext).baseAssert(testContext)
    }
}

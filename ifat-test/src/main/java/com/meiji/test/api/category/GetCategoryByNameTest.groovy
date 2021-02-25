package com.meiji.test.api.category

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.category.GetCategoryByName
import org.testng.annotations.Test

class GetCategoryByNameTest extends BaseTest {
    GetCategoryByName getCategoryByName = new GetCategoryByName()
    @Test(description = "根据分类类型和分类名字获取分类 getCategoryByName" ,groups = ["prod","uat"],testName = "getCategoryByName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryByName(TestContext testContext){
        getCategoryByName.invoke(testContext).baseAssert(testContext)
    }
}

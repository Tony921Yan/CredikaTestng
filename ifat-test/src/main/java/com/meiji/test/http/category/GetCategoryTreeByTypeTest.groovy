package com.meiji.test.http.category

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.category.GetCategoryTreeByType
import org.testng.annotations.Test

class GetCategoryTreeByTypeTest extends BaseTest {
    GetCategoryTreeByType getCategoryTreeByType = new GetCategoryTreeByType()
    @Test(description = "根据分类类型获取分类树 getCategoryTreeByType" ,groups = ["prod","uat"],testName = "getCategoryTreeByType",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryTreeByType(TestContext testContext){
        getCategoryTreeByType.invoke(testContext).baseAssert(testContext)
    }
}

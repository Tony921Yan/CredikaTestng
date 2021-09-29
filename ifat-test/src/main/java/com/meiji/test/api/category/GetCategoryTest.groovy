package com.meiji.test.api.category

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCategoryTest extends BaseTest {
    com.meiji.biz.request.api.category.GetCategoryByName getCategoryByName = new com.meiji.biz.request.api.category.GetCategoryByName()
    @Test(description = "根据分类类型和分类名字获取分类 getCategoryByName" ,groups = ["prod","uat"],testName = "getCategoryByName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryByName(TestContext testContext){
        getCategoryByName.invoke(testContext).baseAssert(testContext)
    }
}

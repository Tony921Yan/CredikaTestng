package com.credika.test.api.category

import com.credika.biz.request.api.category.GetCategoryTreeByType
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCategoryTreeByTypeTest extends BaseTest {
    GetCategoryTreeByType getCategoryTreeByType = new GetCategoryTreeByType()
    @Test(description = "根据分类类型获取分类树 getCategoryTreeByType" ,groups = ["prod","uat"],testName = "getCategoryTreeByType",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryTreeByType(TestContext testContext){
        getCategoryTreeByType.invoke(testContext).baseAssert(testContext)
    }
}

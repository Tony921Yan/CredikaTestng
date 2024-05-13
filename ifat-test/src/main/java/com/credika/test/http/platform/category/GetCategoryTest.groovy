package com.credika.test.http.platform.category

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.category.GetCategory
import org.testng.annotations.Test

class GetCategoryTest extends BaseTest {
    GetCategory getCategoryByName = new GetCategory()
    @Test(description = "根据分类类型和分类名字获取分类-type为空" ,groups = ["prod","uat"],testName = "prodGetCategoryByName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryByName_typeNull(TestContext testContext){
        testContext.put("type",null)
        getCategoryByName.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "根据分类类型和分类名字获取分类-name为空" ,groups = ["prod","uat"],testName = "prodGetCategoryByName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryByName_nameNull(TestContext testContext){
        testContext.put("name",null)
        getCategoryByName.invoke(testContext).baseAssert(testContext)
    }
}

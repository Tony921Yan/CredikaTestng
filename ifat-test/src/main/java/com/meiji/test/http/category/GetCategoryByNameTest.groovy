package com.meiji.test.http.category

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.category.GetCategoryByName
import org.testng.annotations.Test

class GetCategoryByNameTest extends BaseTest {
    GetCategoryByName getCategoryByName = new GetCategoryByName()
    @Test(description = "根据分类类型和分类名字获取分类 getCategoryByName" ,groups = ["prod","uat"],testName = "getCategoryByName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryByName(TestContext testContext){
        getCategoryByName.invoke(testContext).baseAssert(testContext)
        getCategoryByName.dataAssert(testContext)
    }

    @Test(description = "根据分类类型和分类名字获取分类-name不存在" ,groups = ["prod","uat"],testName = "getCategoryByName_nameExits",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryByName_nameExits(TestContext testContext){
        getCategoryByName.invoke(testContext).baseAssert(testContext)
        assert testContext.getResponse().data.size()==0
    }

    @Test(description = "根据分类类型和分类名字获取分类-type不存在" ,groups = ["prod","uat"],testName = "getCategoryByName_typeExits",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryByName_typeExits(TestContext testContext){
        getCategoryByName.invoke(testContext).baseAssert(testContext)
        assert testContext.getResponse().data.size()==0
    }

    @Test(description = "根据分类类型和分类名字获取分类-type为空" ,groups = ["prod","uat"],testName = "getCategoryByName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryByName_typeNull(TestContext testContext){
        testContext.put("type",null)
        getCategoryByName.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "根据分类类型和分类名字获取分类-name为空" ,groups = ["prod","uat"],testName = "getCategoryByName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryByName_nameNull(TestContext testContext){
        testContext.put("name",null)
        getCategoryByName.invoke(testContext).baseAssert(testContext)
    }
}

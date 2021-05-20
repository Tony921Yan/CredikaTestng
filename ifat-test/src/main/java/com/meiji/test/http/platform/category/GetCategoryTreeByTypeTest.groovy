package com.meiji.test.http.platform.category

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.category.GetCategoryTreeByType
import org.testng.annotations.Test

class GetCategoryTreeByTypeTest extends BaseTest {
    GetCategoryTreeByType getCategoryTreeByType = new GetCategoryTreeByType()
    @Test(description = "根据分类类型获取分类树 getCategoryTreeByType" ,groups = ["prod","uat"],testName = "getCategoryTreeByType",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryTreeByType(TestContext testContext){
        getCategoryTreeByType.invoke(testContext).baseAssert(testContext)
        getCategoryTreeByType.dataAssert(testContext)
    }

    @Test(description = "根据分类类型获取分类树-type为空" ,groups = ["prod","uat"],testName = "getCategoryTreeByType_typeNull",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryTreeByType_typeNull(TestContext testContext){
        getCategoryTreeByType.invoke(testContext)
        assert testContext.getResponse().code=="05008"
    }
}

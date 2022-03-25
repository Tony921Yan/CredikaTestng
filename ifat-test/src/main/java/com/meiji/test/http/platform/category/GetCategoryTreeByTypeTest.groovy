package com.meiji.test.http.platform.category

import com.meiji.biz.request.http.platform.category.GetCategoryTreeByType
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCategoryTreeByTypeTest extends BaseTest {
    GetCategoryTreeByType getCategoryTreeByType = new GetCategoryTreeByType()
    @Test(description = "查询类目（根据类目类型获取类目树） getCategoryTreeByType" ,groups = ["prod","uat"],testName = "getCategoryTreeByType",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryTreeByType(TestContext testContext){
        getCategoryTreeByType.invoke(testContext).baseAssert(testContext)
    }
}

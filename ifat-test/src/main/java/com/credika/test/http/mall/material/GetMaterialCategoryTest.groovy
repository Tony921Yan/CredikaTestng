package com.credika.test.http.mall.material

import com.credika.biz.request.http.mall.material.GetMaterialCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMaterialCategoryTest extends BaseTest {
    GetMaterialCategory getMaterialCategory = new GetMaterialCategory()
    @Test(description = "获取分类下的素材 getMaterialCategory" ,groups = ["prod","uat"],testName = "getMaterialCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMaterialCategory(TestContext testContext){
        getMaterialCategory.invoke(testContext).baseAssert(testContext)
    }
}

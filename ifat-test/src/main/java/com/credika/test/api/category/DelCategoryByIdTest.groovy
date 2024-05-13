package com.credika.test.api.category

import com.credika.biz.request.api.category.DelCategoryById
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DelCategoryByIdTest extends BaseTest {
    DelCategoryById delCategoryById = new DelCategoryById()
    @Test(description = "删除类目 delCategoryById" ,groups = ["prod","uat"],testName = "delCategoryById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void delCategoryById(TestContext testContext){
        delCategoryById.invoke(testContext).baseAssert(testContext)
    }
}

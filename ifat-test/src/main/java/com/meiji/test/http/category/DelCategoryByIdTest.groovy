package com.meiji.test.http.category

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.category.DelCategoryById
import org.testng.annotations.Test

class DelCategoryByIdTest extends BaseTest {
    DelCategoryById delCategoryById = new DelCategoryById()
    @Test(description = "删除类目 delCategoryById" ,groups = ["prod","uat"],testName = "delCategoryById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void delCategoryById(TestContext testContext){
        delCategoryById.invoke(testContext).baseAssert(testContext)
        delCategoryById.dataAssert(testContext)
    }

    @Test(description = "删除类目-Id不存在" ,groups = ["prod","uat"],testName = "delCategoryById_IdExits",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void delCategoryById_IdExits(TestContext testContext){
        delCategoryById.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "删除类目-传空id" ,groups = ["prod","uat"],testName = "delCategoryById_IdNull",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void delCategoryById_IdNull(TestContext testContext){
        delCategoryById.invoke(testContext).baseAssert(testContext)
    }
}

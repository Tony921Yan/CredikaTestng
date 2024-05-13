package com.credika.test.http.testInterface.cps

import com.credika.biz.request.http.testInterface.cps.GetAllCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetAllCategoryTest extends BaseTest {
    GetAllCategory getAllCategory = new GetAllCategory()
    @Test(description = "查询美记所有的前台类目 getAllCategory" ,groups = ["prod","uat"],testName = "getAllCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAllCategory(TestContext testContext){
        getAllCategory.invoke(testContext).baseAssert(testContext)
    }
}

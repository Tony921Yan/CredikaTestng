package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.SearchCpsCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchCpsCategoryTest extends BaseTest {
    SearchCpsCategory searchCpsCategory = new SearchCpsCategory()
    @Test(description = "cps类目查询接口 searchCpsCategory" ,groups = ["prod","uat"],testName = "searchCpsCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCpsCategory(TestContext testContext){
        searchCpsCategory.invoke(testContext).baseAssert(testContext)
    }
}

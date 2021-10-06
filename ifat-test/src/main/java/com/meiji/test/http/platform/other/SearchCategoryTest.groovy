package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.order.GetOrderByPage
import com.meiji.biz.request.http.platform.order.SearchCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchCategoryTest extends BaseTest {
    SearchCategory searchCategory = new SearchCategory()
    @Test(description = "美粉圈-分类管理 searchCategory" ,groups = ["prod","uat"],testName = "searchCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCategory(TestContext testContext){
        searchCategory.invoke(testContext).baseAssert(testContext)
    }
}

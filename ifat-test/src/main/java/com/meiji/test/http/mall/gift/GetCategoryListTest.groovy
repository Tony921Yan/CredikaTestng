package com.meiji.test.http.mall.gift
import com.meiji.biz.request.http.mall.gift.GetCategoryList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCategoryListTest extends BaseTest {
    GetCategoryList getCategoryList = new GetCategoryList()
    @Test(description = "送礼专区-分类列表  GetCategoryList" ,groups = ["prod","uat"],testName = "",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getCategoryList(TestContext testContext){
        getCategoryList.invoke(testContext).baseAssert(testContext)
    }
}

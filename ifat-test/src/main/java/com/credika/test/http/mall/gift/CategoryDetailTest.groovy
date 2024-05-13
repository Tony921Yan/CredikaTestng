package com.credika.test.http.mall.gift
import com.credika.biz.request.http.mall.gift.CategoryDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CategoryDetailTest extends BaseTest {
    CategoryDetail categoryDetail = new CategoryDetail()
    @Test(description = "送礼专区-分类详情 CategoryDetail" ,groups = ["prod","uat"],testName = "categoryDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void categoryDetail(TestContext testContext){
        categoryDetail.invoke(testContext).baseAssert(testContext)
    }
}

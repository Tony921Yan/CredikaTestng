package com.credika.test.http.platform.other


import com.credika.biz.request.http.platform.other.SelectionCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SelectionCategoryTest extends BaseTest {
    SelectionCategory selectionCategory = new SelectionCategory()
    @Test(description = "选品中心类目 goodsSubject" ,groups = ["prod","uat"],testName = "selectionCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void selectionCategory(TestContext testContext){
        selectionCategory.invoke(testContext).baseAssert(testContext)
        selectionCategory.specialAssert(testContext)
    }
}

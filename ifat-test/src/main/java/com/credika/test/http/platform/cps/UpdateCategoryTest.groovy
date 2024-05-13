package com.credika.test.http.platform.cps
import com.credika.biz.request.http.platform.cps.UpdateCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateCategoryTest extends BaseTest {
    UpdateCategory updateCategory = new UpdateCategory()
    Random random = new Random()
    @Test(description = "更新频道 updateCategory" ,groups = ["prod","uat"],testName = "updateCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateCategory(TestContext testContext){
        testContext.put("status",random.nextInt(2)+1)
        updateCategory.invoke(testContext).baseAssert(testContext)
    }
}



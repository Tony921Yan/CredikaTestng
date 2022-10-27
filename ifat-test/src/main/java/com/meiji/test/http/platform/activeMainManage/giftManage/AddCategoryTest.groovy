package com.meiji.test.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.activeMainManage.giftManage.AddCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddCategoryTest extends BaseTest {
    AddCategory addCategory = new AddCategory()
    @Test(description = "送礼管理-分类管理-新增分类 addCategory" ,groups = ["prod","uat"],testName = "addCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addCategory(TestContext testContext){
        testContext.put("name",'自动化测试')
        testContext.put("status",0)
        testContext.put("sort",-999999)
        addCategory.invoke(testContext).baseAssert(testContext)
    }

}
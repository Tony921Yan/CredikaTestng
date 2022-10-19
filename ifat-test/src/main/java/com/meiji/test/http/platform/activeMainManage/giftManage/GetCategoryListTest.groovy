package com.meiji.test.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.activeMainManage.giftManage.GetCategoryList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCategoryListTest extends BaseTest {
    GetCategoryList getCategoryList = new GetCategoryList()
    @Test(description = "送礼管理-分类查询 getCategoryList" ,groups = ["prod","uat"],testName = "getCategoryList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryList(TestContext testContext){
        getCategoryList.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "送礼管理-分类查询-上架状态-上架 getCategoryList01",groups = ["prod","uat"],testName = "getCategoryList01" ,
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryList01(TestContext testContext){
        getCategoryList.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "送礼管理-分类查询-上架状态-下架 getCategoryList02",groups = ["prod","uat"],testName = "getCategoryList02" ,
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryList02(TestContext testContext){
        getCategoryList.invoke(testContext).baseAssert(testContext)
    }

}
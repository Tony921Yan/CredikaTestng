package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.GetCombinationList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCombinationListTest extends BaseTest {
    GetCombinationList getCombinationList = new GetCombinationList()
    @Test(description = "送礼管理-组合礼品分页查询 getCourseList" ,groups = ["prod","uat"],testName = "getCombinationList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCombinationList(TestContext testContext){
        getCombinationList.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "送礼管理-组合礼品分页查询-上架状态-上架 getCourseList01",groups = ["prod","uat"],testName = "getCombinationList01" ,
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCombinationList01(TestContext testContext){
        getCombinationList.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "送礼管理-组合礼品分页查询-上架状态-下架 getCourseList02",groups = ["prod","uat"],testName = "getCombinationList02" ,
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCombinationList02(TestContext testContext){
        getCombinationList.invoke(testContext).baseAssert(testContext)
    }

}
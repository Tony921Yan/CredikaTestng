package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.GetCourseList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCourseListTest extends BaseTest {
    GetCourseList getCourseList = new GetCourseList()
    @Test(description = "送礼管理-送礼专区教程查询 getCourseList" ,groups = ["prod","uat"],testName = "getCourseList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCourseList(TestContext testContext){
        getCourseList.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "送礼管理-送礼专区教程查询-上架状态-上架 getCourseList01",groups = ["prod","uat"],testName = "getCourseList01" ,
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCourseList01(TestContext testContext){
        getCourseList.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "送礼管理-送礼专区教程查询-上架状态-下架 getCourseList02",groups = ["prod","uat"],testName = "getCourseList02" ,
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCourseList02(TestContext testContext){
        getCourseList.invoke(testContext).baseAssert(testContext)
    }

}
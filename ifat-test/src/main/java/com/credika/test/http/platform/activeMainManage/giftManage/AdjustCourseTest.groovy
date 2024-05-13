package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.AdjustCourse
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AdjustCourseTest extends BaseTest {
    AdjustCourse adjustCourse = new AdjustCourse()
    @Test(description = "送礼管理-送礼专区教程-上架" ,groups = ["prod","uat"],testName = "adjustCourse",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void adjustCourse(TestContext testContext){
        testContext.put("id", MysqlService.adjustCourse().get(0))
        testContext.put("action",1)
        adjustCourse.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "送礼管理-送礼专区教程-下架" ,groups = ["prod","uat"],testName = "adjustCourse01",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void adjustCourse01(TestContext testContext){
        testContext.put("id", MysqlService.adjustCourse01().get(0))
        testContext.put("action",0)
        adjustCourse.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "送礼管理-送礼专区教程-删除" ,groups = ["prod","uat"],testName = "adjustCategory02",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void adjustCourse02(TestContext testContext){
        testContext.put("id", MysqlService.adjustCourse().get(0))
        testContext.put("action",2)
        adjustCourse.invoke(testContext).baseAssert(testContext)
    }



}
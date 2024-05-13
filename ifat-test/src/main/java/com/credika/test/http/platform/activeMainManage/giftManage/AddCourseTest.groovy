package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.AddCourse
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddCourseTest extends BaseTest {
    AddCourse addCourse = new AddCourse()
    @Test(description = "送礼管理-送礼专区教程-新增教程 addCourse" ,groups = ["prod","uat"],testName = "addCourse",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addCourse(TestContext testContext){
        addCourse.invoke(testContext).baseAssert(testContext)
    }

}
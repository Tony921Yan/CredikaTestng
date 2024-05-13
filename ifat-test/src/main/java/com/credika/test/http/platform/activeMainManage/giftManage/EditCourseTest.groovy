package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.EditCourse
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class EditCourseTest extends BaseTest {
    EditCourse editCourse = new EditCourse()
    @Test(description = "送礼管理-送礼专区教程-修改" ,groups = ["prod","uat"],testName = "editCourse",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void editCourse(TestContext testContext){
        testContext.put("id", MysqlService.editCourse().get(0))
        testContext.put("sort",MysqlService.editCourse01().get(0))
        testContext.put("pic",MysqlService.editCourse02().get(0))
        editCourse.invoke(testContext).baseAssert(testContext)
    }


}
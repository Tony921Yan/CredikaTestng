package com.credika.test.http.platform.activeMainManage

import com.credika.biz.request.http.platform.activeMainManage.ActiveMainManagePublishActivity
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ActiveMainManagePublishActivityTest extends BaseTest {
    ActiveMainManagePublishActivity activeMainManagePublishActivity = new ActiveMainManagePublishActivity()
    @Test(description = "活动管理-发布秒杀活动 activeMainManagePublishActivity" ,groups = ["prod","uat"],testName = "activeMainManagePublishActivity",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void activeMainManagePublishActivity(TestContext testContext){
        testContext.put("id", MysqlService.setNewActiveStatus("3"))
        testContext.put("status",3)
        activeMainManagePublishActivity.invoke(testContext).baseAssert(testContext)
    }

}
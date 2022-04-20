package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.ActiveMainManageUpdate
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ActiveMainManageUpdateTest extends BaseTest {
    ActiveMainManageUpdate activeMainManageUpdate = new ActiveMainManageUpdate()
    @Test(description = "活动管理-修改秒杀活动 activeMainManageUpdate" ,groups = ["prod","uat"],testName = "activeMainManageUpdate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void activeMainManageUpdate(TestContext testContext){
        testContext.put("id", MysqlService.getNewestID())
        activeMainManageUpdate.invoke(testContext).baseAssert(testContext)
    }

}
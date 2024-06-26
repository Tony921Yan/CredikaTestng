package com.credika.test.http.platform.activeMainManage

import com.credika.biz.request.http.platform.activeMainManage.ActiveMainManageUpdate
import com.credika.biz.request.http.platform.activeMainManage.Detail
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ActiveMainManageUpdateTest extends BaseTest {
    ActiveMainManageUpdate activeMainManageUpdate = new ActiveMainManageUpdate()
    Detail detail = new Detail()
    @Test(description = "活动管理-修改秒杀活动 activeMainManageUpdate" ,groups = ["prod","uat"],testName = "activeMainManageUpdate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void activeMainManageUpdate(TestContext testContext){
        testContext.put("id", MysqlService.getNewestID())
        detail.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        activeMainManageUpdate.invoke(testContext).baseAssert(testContext)
    }

}
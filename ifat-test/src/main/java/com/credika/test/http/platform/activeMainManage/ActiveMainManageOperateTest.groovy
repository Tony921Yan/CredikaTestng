package com.credika.test.http.platform.activeMainManage

import com.credika.biz.request.http.platform.activeMainManage.ActiveMainManageOperate
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ActiveMainManageOperateTest extends BaseTest {
    ActiveMainManageOperate activeMainManageOperate = new ActiveMainManageOperate()
    @Test(description = "活动管理-提交秒杀活动 activeMainManageOperate" ,groups = ["prod","uat"],testName = "activeMainManageOperate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void activeMainManageOperate(TestContext testContext){
        testContext.put("status",2)
        testContext.put("id", MysqlService.setNewActiveStatus("2"))
        activeMainManageOperate.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动管理-取消秒杀活动 activeMainManageOperate" ,groups = ["prod","uat"],testName = "activeMainManageOperate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void activeMainManageOperate1(TestContext testContext){
        testContext.put("status",6)
        testContext.put("id", MysqlService.setNewActiveStatus("4"))
        activeMainManageOperate.invoke(testContext).baseAssert(testContext)
    }
}
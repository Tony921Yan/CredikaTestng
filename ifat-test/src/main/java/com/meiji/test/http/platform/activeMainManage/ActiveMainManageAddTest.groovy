package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.ActiveMainManageAdd
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ActiveMainManageAddTest extends BaseTest {
    ActiveMainManageAdd activeMainManageAdd = new ActiveMainManageAdd()
    @Test(description = "活动管理-新增秒杀活动 activeMainManageAdd" ,groups = ["prod","uat"],testName = "activeMainManageAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void activeMainManageAdd(TestContext testContext){
//        MysqlService.deleteSecKillActive()
        activeMainManageAdd.invoke(testContext).baseAssert(testContext)
    }

}
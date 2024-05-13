package com.credika.test.http.platform.activeMainManage.giftAdvManage

import com.credika.biz.request.http.platform.activeMainManage.giftAdvManage.ToggleStatus
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ToggleStatusTest extends BaseTest {
    ToggleStatus toggleStatus = new ToggleStatus()
    @Test(description = "营销管理-送礼管理-广告位管理-开启/关闭 toggleStatus" ,groups = ["prod","uat"],testName = "toggleStatus",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void toggleStatus(TestContext testContext){
        testContext.put("id",1)
        MysqlService.setToggleStatus(testContext.get("id"));
        testContext.put("isDisable",0)  //接口传参，与数据库状态刚好相反
        toggleStatus.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}
package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.AuditGoods
import com.meiji.biz.request.http.platform.goods.GetInfoSupervisor
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

//import com.miyuan.ifat.support.util.JsonUtil

class GetInfoSupervisorTest extends BaseTest {
    GetInfoSupervisor getInfoSupervisor = new GetInfoSupervisor()
    @Test(description = "获取采购责任人信息 getInfoSupervisor" ,groups = ["prod","uat"],testName = "getInfoSupervisor",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getInfoSupervisor(TestContext testContext){
        getInfoSupervisor.invoke(testContext).baseAssert(testContext)
    }
}

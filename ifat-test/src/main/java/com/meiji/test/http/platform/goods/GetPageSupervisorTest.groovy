package com.meiji.test.http.platform.goods


import com.meiji.biz.request.http.platform.goods.GetPageSupervisor
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

//import com.miyuan.ifat.support.util.JsonUtil

class GetPageSupervisorTest extends BaseTest {
    GetPageSupervisor getPageSupervisor = new GetPageSupervisor()
    @Test(description = "获取采购责任人列表 getPageSupervisor" ,groups = ["prod","uat"],testName = "getPageSupervisor",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getPageSupervisor(TestContext testContext){
        getPageSupervisor.invoke(testContext).baseAssert(testContext)
    }
}

package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.GetGoodsByName
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsByNameTest extends BaseTest {
    GetGoodsByName getGoodsByName = new GetGoodsByName()
    @Test(description = "通过关键字查询商品 getGoodsByName" ,groups = ["prod","uat"],testName = "getGoodsByName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByName(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        getGoodsByName.invoke(testContext).baseAssert(testContext)
    }
}

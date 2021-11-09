package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.GetGoodsByCategoryIds
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsByCategoryIdsTest extends BaseTest {
    GetGoodsByCategoryIds getGoodsByCategoryIds = new GetGoodsByCategoryIds()
    @Test(description = "通过商品类目id查询商品 getGoodsByCategoryIds" ,groups = ["prod","uat"],testName = "getGoodsByCategoryIds",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByCategoryIds(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",1)
        testContext.put("categoryIds",[1])
        getGoodsByCategoryIds.invoke(testContext).baseAssert(testContext)
    }
}

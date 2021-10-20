package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.GetGoodsByIds
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsByIdsTest extends BaseTest {
    GetGoodsByIds getGoodsByIds = new GetGoodsByIds()
    @Test(description = "通过商品id查询商品详情 getGoodsByIds" ,groups = ["prod","uat"],testName = "getGoodsByIds",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByIds(TestContext testContext){
        testContext.put("spuIds",[1410324940980257])
        getGoodsByIds.invoke(testContext).baseAssert(testContext)
    }
}

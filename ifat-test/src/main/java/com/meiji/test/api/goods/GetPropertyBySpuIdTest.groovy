package com.meiji.test.api.goods


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetPropertyBySpuIdTest extends BaseTest {
    com.meiji.biz.request.api.goods.GetPropertyBySpuld getPropertyBySpuld = new com.meiji.biz.request.api.goods.GetPropertyBySpuld()
    @Test(description = "根据spuid获取属性 getPropertyBySpuId" ,groups = ["prod","uat"],testName = "getPropertyBySpuId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getPropertyBySpuld(TestContext testContext){
        getPropertyBySpuld.invoke(testContext).baseAssert(testContext)
    }
}
package com.meiji.test.http.goods

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.goods.GetPropertyBySpuld
import org.testng.annotations.Test

class GetPropertyBySpuIdTest extends BaseTest {
    GetPropertyBySpuld getPropertyBySpuld = new GetPropertyBySpuld()
    @Test(description = "根据spuid获取属性 getPropertyBySpuId" ,groups = ["prod","uat"],testName = "getPropertyBySpuId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getPropertyBySpuld(TestContext testContext){
        getPropertyBySpuld.invoke(testContext).baseAssert(testContext)
    }
}
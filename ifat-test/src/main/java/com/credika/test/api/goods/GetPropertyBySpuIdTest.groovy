package com.credika.test.api.goods

import com.credika.biz.request.api.goods.GetPropertyBySpuld
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetPropertyBySpuIdTest extends BaseTest {
    GetPropertyBySpuld getPropertyBySpuld = new GetPropertyBySpuld()
    @Test(description = "根据spuid获取属性 getPropertyBySpuId" ,groups = ["prod","uat"],testName = "getPropertyBySpuId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getPropertyBySpuld(TestContext testContext){
        getPropertyBySpuld.invoke(testContext).baseAssert(testContext)
    }
}
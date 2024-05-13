package com.credika.test.http.mall.traceability

import com.credika.biz.request.http.mall.traceability.GetSearchKeys
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy
 * * @date 2022/11/08
 * @Vession V3.5
 * */
class GetSearchKeysTest extends BaseTest {
    GetSearchKeys getSearchKeys = new GetSearchKeys()
    @Test(description = "溯源广场-获取关键字 getSearchKeys" ,groups = ["prod","uat"],testName = "getSearchKeys",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSearchKeys(TestContext testContext){
        getSearchKeys.invoke(testContext).baseAssert(testContext)
    }
}
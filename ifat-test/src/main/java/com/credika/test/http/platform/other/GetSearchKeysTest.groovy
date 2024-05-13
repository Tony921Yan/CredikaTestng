package com.credika.test.http.platform.other

import com.credika.biz.request.http.platform.other.GetSearchKeys
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSearchKeysTest extends BaseTest {
    GetSearchKeys getSearchKeys = new GetSearchKeys()
    @Test(description = "搜索关键词配置 getSearchKeys" ,groups = ["prod","uat"],testName = "getSearchKeys",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSearchKeys(TestContext testContext){
        getSearchKeys.invoke(testContext).baseAssert(testContext)
    }
}

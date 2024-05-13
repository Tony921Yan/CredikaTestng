package com.credika.test.http.mall.home

import com.credika.biz.request.http.mall.home.GetSearchKeys
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class GetSearchKeysTest extends BaseTest {
    GetSearchKeys getSearchKeys = new GetSearchKeys()
    @Test(description = "获取搜索关键词 getSearchKeys" ,groups = ["prod","uat"],testName = "getSearchKeys",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSearchKeys(TestContext testContext){
        getSearchKeys.invoke(testContext).baseAssert(testContext)
    }
}

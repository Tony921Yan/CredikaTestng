package com.meiji.test.http.mall.gift

import com.meiji.biz.request.http.mall.gift.GetToShareCount
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
class GetToShareCountTest extends BaseTest {
    GetToShareCount getToShareCount = new GetToShareCount()
    @Test(description = "获取待晒单数 getToShareCount" ,groups = ["prod","uat"],testName = "getToShareCount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getToShareCount(TestContext testContext){
        getToShareCount.invoke(testContext).baseAssert(testContext)
    }
}

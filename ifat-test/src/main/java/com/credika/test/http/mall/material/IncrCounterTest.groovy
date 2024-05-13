package com.credika.test.http.mall.material

import com.credika.biz.request.http.mall.material.IncrCounter
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class IncrCounterTest extends BaseTest {
    IncrCounter incrCounter = new IncrCounter()
    @Test(description = "记录下载还是分享 incrCounter" ,groups = ["prod","uat"],testName = "incrCounter",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void incrCounter(TestContext testContext){
        incrCounter.invoke(testContext).baseAssert(testContext)
    }
}

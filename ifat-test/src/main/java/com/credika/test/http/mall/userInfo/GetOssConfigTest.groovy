package com.credika.test.http.mall.userInfo


import com.credika.biz.request.http.mall.userInfo.GetOssConfig
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession history
 * */
class GetOssConfigTest extends BaseTest {
        GetOssConfig getOssConfig = new GetOssConfig()
    @Test(description = "获取oss配置 getOssConfig" ,groups = ["prod","uat"],testName = "getOssConfig",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOssConfig(TestContext testContext){
        testContext.put("maxSize",10)
        getOssConfig.invoke(testContext).baseAssert(testContext)
    }
}

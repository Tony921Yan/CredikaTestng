package com.meiji.test.http.platform.integral

import com.meiji.biz.request.http.platform.integral.GetIntegralList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetIntegralListTest extends BaseTest {
    GetIntegralList getIntegralList = new GetIntegralList()
    @Test(description = "获取积分数据 getIntegralList" ,groups = ["prod","uat"],testName = "getIntegralList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        getIntegralList.invoke(testContext).baseAssert(testContext)

    }
}

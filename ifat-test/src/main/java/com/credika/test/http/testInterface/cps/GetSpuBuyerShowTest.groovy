package com.credika.test.http.testInterface.cps

import com.credika.biz.request.http.testInterface.cps.GetSpuBuyerShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSpuBuyerShowTest extends BaseTest {
    GetSpuBuyerShow getSpuBuyerShow = new GetSpuBuyerShow()
    @Test(description = "获取精选晒单 getSpuBuyerShow" ,groups = ["prod","uat"],testName = "getSpuBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSpuBuyerShow(TestContext testContext){
        getSpuBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}

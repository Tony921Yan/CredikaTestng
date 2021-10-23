package com.meiji.test.http.platform.finance

import com.meiji.biz.request.http.platform.finance.GetCardDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCardDetailTest extends BaseTest {
    GetCardDetail getCardDetail = new GetCardDetail()
    @Test(description = "渠道费用-去付款 getCardDetail" ,groups = ["prod","uat"],testName = "getCardDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCardDetail(TestContext testContext){
        getCardDetail.invoke(testContext).baseAssert(testContext)
    }
}

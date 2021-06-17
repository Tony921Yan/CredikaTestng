package com.meiji.test.http.OMS.account



import com.meiji.biz.request.http.OMS.account.GetRegionCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetRegionCodeTest extends BaseTest {
    GetRegionCode getRegionCode = new GetRegionCode()
    @Test(description = "获取省市区编码 getRegionCode" ,groups = ["prod","uat"],testName = "OMSgetRegionCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getRegionCode(TestContext testContext){
        getRegionCode.invoke(testContext).baseAssert(testContext)
    }
}

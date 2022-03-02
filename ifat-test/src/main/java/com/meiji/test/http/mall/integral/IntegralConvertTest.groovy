package com.meiji.test.http.mall.integral
import com.meiji.biz.request.http.mall.integral.IntegralConvert
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class IntegralConvertTest extends BaseTest{
    IntegralConvert integralConvert = new IntegralConvert()
    @Test(description = "积分兑券 integralConvert" ,groups = ["prod","uat"],testName = "integralConvert",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void integralConvert(TestContext testContext){
        integralConvert.invoke(testContext).baseAssert(testContext)
    }
}

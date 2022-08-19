package com.meiji.test.http.mall.integral
import com.meiji.biz.request.http.mall.integral.IntegralConvert
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class IntegralConvertTest extends BaseTest{
    IntegralConvert integralConvert = new IntegralConvert()
    @Test(description = "积分兑券 integralConvert" ,groups = ["prod","uat"],testName = "integralConvert",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void integralConvert(TestContext testContext){
        if(MysqlService.integralConvert1()!=null){
            testContext.put("dealerId","102")
            testContext.put("userId","1429851454046240")
            testContext.put("couponName","非会员测试券")
            testContext.put("activeId",MysqlService.integralConvert1())
            testContext.put("couponId",MysqlService.integralConvert2().getAt(2).getAt("coupon_id"))
            testContext.put("integral",MysqlService.integralConvert3().getAt(2).getAt("integral"))
            integralConvert.invoke(testContext).baseAssert(testContext)
        }
    }
}

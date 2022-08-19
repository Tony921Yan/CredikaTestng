package com.meiji.test.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.grantCouponActive.GetActiveDetailById
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.SkipException
import org.testng.annotations.Test

class GetActiveDetailByIdTest extends BaseTest {
    GetActiveDetailById getActiveDetailById = new GetActiveDetailById()
    @Test(description = "兑券活动详情 getActiveDetailById" ,groups = ["prod","uat"],testName = "getActiveDetailById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveDetailById(TestContext testContext){
         if(MysqlService.grantCouponActiveID("2") != null){
            testContext.put("id", MysqlService.grantCouponActiveID("2"))
            getActiveDetailById.invoke(testContext).baseAssert(testContext)
        }

    }
}
package com.credika.test.http.platform.grantCouponActive
import com.credika.biz.request.http.platform.grantCouponActive.DeleteActive
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteActiveTest extends BaseTest {
    DeleteActive deleteActive = new DeleteActive()
    @Test(description = "删除活动 deleteActive" ,groups = ["prod","uat"],testName = "deleteActive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteActive(TestContext testContext){
        testContext.put("id", MysqlService.grantCouponActiveID("2"))
        deleteActive.invoke(testContext).baseAssert(testContext)
    }
}
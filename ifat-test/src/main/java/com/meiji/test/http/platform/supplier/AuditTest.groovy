package com.meiji.test.http.platform.supplier
import com.meiji.biz.request.http.platform.suppiler.Audit
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AuditTest extends BaseTest { //supplier_status状态为6才能审核
    Audit audit = new Audit()
    @Test(description = "审核供应商 audit" ,groups = ["prod","uat"],testName = "audit",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void audit(TestContext testContext){
        audit.invoke(testContext).baseAssert(testContext)
    }
}

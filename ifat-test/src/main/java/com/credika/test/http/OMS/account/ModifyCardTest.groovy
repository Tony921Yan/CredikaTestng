package com.credika.test.http.OMS.account
import com.credika.biz.request.http.OMS.account.ModifyCard
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ModifyCardTest extends BaseTest {
    ModifyCard modifyCard =new ModifyCard()
    @Test(description = "供应商修改结算卡号 modifyCard" ,groups = ["prod","uat"],testName = "OMSmodifyCard",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void modifyCard(TestContext testContext){
        modifyCard.invoke(testContext).baseAssert(testContext)
    }
}

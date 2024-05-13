package com.credika.test.http.platform.channel
import com.credika.biz.request.http.platform.channel.TransferColumn
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
class TransferColumnTest extends BaseTest {
    TransferColumn transferColumn = new TransferColumn()
    @Test(description = "晒单管理-栏目迁移 transferColumn" ,groups = ["prod","uat"],testName = "transferColumn",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void transferColumn(TestContext testContext){
        ArrayList<Long> list = MysqlService.transferColumn()
        testContext.put("ids",list )
        transferColumn.invoke(testContext).baseAssert(testContext)
    }
}

package com.credika.test.http.platform.channel
import com.credika.biz.request.http.platform.channel.AuditBuyerShow
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
import java.text.SimpleDateFormat

class AuditBuyerShowTest extends BaseTest {
    AuditBuyerShow auditBuyerShow = new AuditBuyerShow()
    @Test(description = "审核晒单(溯源) auditBuyerShow" ,groups = ["prod","uat"],testName = "auditBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditBuyerShow(TestContext testContext){
        testContext.put("columnId", MysqlService.searchBuyerShow())
        Map map = MysqlService.auditData().get(0)
        println(MysqlService.auditData().get(0).get("id"))
        println(MysqlService.auditData().get(0).get("business_type"))
        String auditData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(MysqlService.auditData().get(0).get("publish_date"))
        map.put("publishDate",auditData)
        ArrayList<Map> auditDataList = new ArrayList<Map>()
//        auditDataList.add(MysqlService.auditData().get(0).get("id"));
//        auditDataList.add(MysqlService.auditData().get(0).get("business_type"));
        auditDataList.add(map);
        testContext.put("auditData",auditDataList)
        auditBuyerShow.invoke(testContext).baseAssert(testContext)
    }

}

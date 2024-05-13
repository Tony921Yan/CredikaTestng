package com.credika.test.http.platform.live
import com.credika.biz.request.http.platform.live.AuditGoods
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AuditGoodsTest extends BaseTest {
    AuditGoods auditGoods = new AuditGoods()
    @Test(description = "商品提交审核  auditGoods" ,groups = ["prod","uat"],testName = "auditGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditGoods(TestContext testContext){
        if(MysqlService.auditGoodsID().getAt(0)!=null){
            testContext.put("goodsId", MysqlService.auditGoodsID().getAt(0))
            auditGoods.invoke(testContext).baseAssert(testContext)
        }
    }
}

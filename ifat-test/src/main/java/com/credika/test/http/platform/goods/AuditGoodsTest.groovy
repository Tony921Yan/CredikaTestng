package com.credika.test.http.platform.goods

import com.credika.biz.request.http.platform.goods.AuditGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
//import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class AuditGoodsTest extends BaseTest {  //status=1时才可执行
    AuditGoods auditGoods = new AuditGoods()
    @Test(description = "审核商品 auditGoods" ,groups = ["prod","uat"],testName = "auditGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditGoods(TestContext testContext){
        auditGoods.invoke(testContext).baseAssert(testContext)
    }
}

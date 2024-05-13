package com.credika.test.http.platform.live
import com.credika.biz.request.http.platform.live.UpdateGoods
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateGoodsTest extends BaseTest {
    UpdateGoods updateGoods = new UpdateGoods()
    @Test(description = "更新商品信息  updateGoods" ,groups = ["prod","uat"],testName = "deleteRole",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateGoods(TestContext testContext){
        if(MysqlService.auditGoodsID1().getAt(0) != null){
            testContext.put("goodsId", MysqlService.auditGoodsID1().getAt(0))
            testContext.put("priceType",MysqlService.auditGoodsID2().getAt(0))
            testContext.put("price",MysqlService.auditGoodsID3().getAt(0))
//            testContext.put("priceType",1)
//            testContext.put("price",1)
            updateGoods.invoke(testContext).baseAssert(testContext)
        }
    }
}

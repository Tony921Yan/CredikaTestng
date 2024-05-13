package com.credika.test.http.OMS.order
import com.credika.biz.request.http.OMS.order.UpdateDeliverOrderGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateDeliverOrderGoodsTest extends BaseTest {
    UpdateDeliverOrderGoods updateDeliverOrderGoods = new UpdateDeliverOrderGoods()
    @Test(description = "更新订单发货 updateDeliverOrderGoods" ,groups = ["prod","uat"],testName = "OMSupdateDeliverOrderGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateDeliverOrderGoods(TestContext testContext){
        updateDeliverOrderGoods.invoke(testContext).baseAssert(testContext)
    }
}

package com.meiji.test.http.order

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.order.DeliverOrderGoods
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class DeliverOrderGoodsTest extends BaseTest { //order_info order_status 为4
    DeliverOrderGoods deliverOrderGoods = new DeliverOrderGoods()
    @Test(description = "订单发货 deliverOrderGoods" ,groups = ["prod","uat"],testName = "deliverOrderGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deliverOrderGoods(TestContext testContext){
        testContext.put("goodsList", JsonUtil.objToJsonList(testContext.get("goodsList")))
        deliverOrderGoods.invoke(testContext).baseAssert(testContext)
    }
}

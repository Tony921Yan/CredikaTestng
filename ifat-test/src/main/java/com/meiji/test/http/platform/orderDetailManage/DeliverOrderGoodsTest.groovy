package com.meiji.test.http.platform.orderDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.orderDetailManage.DeliverOrderGoods
import org.testng.annotations.Test

class DeliverOrderGoodsTest extends BaseTest { //order_info order_status 为4
    DeliverOrderGoods deliverOrderGoods = new DeliverOrderGoods()
    @Test(description = "订单发货-异常场景：线上O2022032421520143300 deliverOrderGoods" ,groups = ["prod","uat"],testName = "deliverOrderGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deliverOrderGoods(TestContext testContext){
        //testContext.put("goodsList", JsonUtil.objToJsonList(testContext.get("goodsList")))
        deliverOrderGoods.invoke(testContext).baseAssert(testContext)
    }
}

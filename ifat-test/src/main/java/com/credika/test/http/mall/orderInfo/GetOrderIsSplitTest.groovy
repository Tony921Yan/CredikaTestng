package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.GetOrderIsSplit
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy*
 * @date 2022/03/18 12:07
 * @Vession v2.6.3
 * */
class GetOrderIsSplitTest extends BaseTest {
    GetOrderIsSplit getOrderIsSplit = new GetOrderIsSplit()
    @Test(description = "订单是否拆单 getOrderIsSplit" ,groups = ["prod","uat"],testName = "getOrderIsSplit",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderIsSplit(TestContext testContext){
        getOrderIsSplit.invoke(testContext).baseAssert(testContext)
    }
}

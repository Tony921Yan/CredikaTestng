package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.MiyuanPageOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MiyuanPageOrderTest extends BaseTest {
    MiyuanPageOrder miyuanPageOrder = new MiyuanPageOrder()
    @Test(description = "订单列表查询-订单更新时间查询 miyuanPageOrder" ,groups = ["prod","uat"],testName = "prodmiyuanPageOrder1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void miyuanPageOrder1(TestContext testContext){
        miyuanPageOrder.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "订单列表查询-订单创建时间查询 miyuanPageOrder" ,groups = ["prod","uat"],testName = "prodmiyuanPageOrder2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void miyuanPageOrder2(TestContext testContext){
        miyuanPageOrder.invoke(testContext).baseAssert(testContext)
    }

}


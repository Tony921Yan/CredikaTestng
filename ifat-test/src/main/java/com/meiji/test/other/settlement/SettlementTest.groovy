package com.meiji.test.other.settlement

import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class SettlementTest extends BaseTest{
    @Test(dataProvider = "orderData")
    void settle(TestContext testContext){
        testContext.appendLog(new Record("订单号",testContext.orderNo))
        //toDo 查询每个订单，校验数据
    }

    @DataProvider
    TestContext[] orderData(){
        List orderList = MysqlService.getSettleOrder()
        List testContextList = new ArrayList()
        orderList.forEach{it->
            TestContext testContext = new TestContext()
            testContext.put("orderNo",it)
            testContext.put("description",it)
            testContextList.add(testContext)
        }
        return testContextList
    }
}

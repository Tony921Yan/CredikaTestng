package com.credika.test.other.orderStatus


import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class orderStatusCompare extends BaseTest {

    @Test(dataProvider = "orders",groups = ["prod"])
    void orderTest(TestContext testContext){
        String orderNo = testContext.get("order_code")
        String orderStatus = testContext.get("order_status")
        Map settlementOrder = MysqlService.getSettlementOrderStatusByOrderNo(orderNo)
        assert settlementOrder !=null,'订单号'+orderNo+'结算表无数据'
        String settlementStatus = settlementOrder.get("state")
        testContext.appendLog(new Record("订单号",orderNo));
        testContext.appendLog(new Record("订单状态",orderStatus));
        testContext.appendLog(new Record("结算状态",settlementStatus));
            assert orderStatus == settlementStatus,"订单号"+orderNo
    }
    @DataProvider
    TestContext[] orders(){
        List<Map> getOrderInfo = MysqlService.getOrderInfoStatus();
        List list = new ArrayList();
        for (Map map:getOrderInfo){
            TestContext testContext = new TestContext();
            testContext.put("order_code",map.get("order_code").toString());
            testContext.put("order_status",map.get("order_status").toString())
            testContext.put("description",map.get("order_code").toString())
            list.add(testContext);
        }
        return list;
    }
}

package com.meiji.test.other.compareOrderAndSettlementStatus;

import com.meiji.biz.service.MysqlService;
import com.miyuan.ifat.support.test.BaseTest;
import com.miyuan.ifat.support.test.TestContext;
import com.miyuan.ifat.support.vo.Record;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderAndSettlementStatus extends BaseTest {
    @Test(dataProvider = "compareOrderAndSettlementStatus")
    void order(TestContext testContext){
        testContext.appendLog(new Record("订单号",testContext.get("order_code").toString()));
    }
    @DataProvider
    Object[] compareOrderAndSettlementStatus(){
        List<Map> getOrderInfo = MysqlService.getOrderInfoStatus();
        List<Map> getSettlementOrder = MysqlService.getSettlementOrderStatus();
        assert getOrderInfo.size() == getSettlementOrder.size();
        List list = new ArrayList();
        for (Map map:getOrderInfo){
            for(Map map1:getSettlementOrder){
                if(map.get("order_code").toString().equals(map1.get("trade_order_no").toString())){
                    assert map.get("order_status").toString().equals(map1.get("state").toString());
                    TestContext testContext = new TestContext();
                    testContext.put("order_code",map.get("order_code").toString());
                    list.add(testContext);
//                    System.out.println("订单号："+testContext.get("order_code").toString() +"订单状态："+ testContext.get("order_status").toString()+ "; 和结算单号" +
//                            testContext.get("trade_order_no").toString() + "状态一致，为："+testContext.get("state").toString());
                }
            }
        }
        return list.toArray();
    }
}

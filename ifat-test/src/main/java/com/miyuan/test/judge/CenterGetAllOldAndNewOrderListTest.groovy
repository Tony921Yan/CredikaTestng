package com.miyuan.test.judge

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.order.CenterGetOrderList

import com.miyuan.request.infra.order.CenterGetOrderListnew
import org.testng.annotations.Test

import java.util.stream.Collectors

class CenterGetAllOldAndNewOrderListTest extends BaseTest{
    CenterGetOrderListnew centerGetAllNewOrderList = new CenterGetOrderListnew()
    CenterGetOrderList centerGetAllOrderList = new CenterGetOrderList()
    @Test(description = "查询新旧全部订单" ,groups = ["prod","prod"],testName = "centerGetOldAndNewOrderList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerGetFailOrderListSuccess(TestContext testContext){
        //新订单接口
        centerGetAllNewOrderList.invoke(testContext)
        List<Map> orderNewList = testContext.getResponse().data.dataList
        List<String> newOrderCreatTimes = orderNewList.stream().map { x -> return x."sourceCreateTime" }.collect(Collectors.toList())
        List<String> newOrderIds = orderNewList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
        List<String> newOrderStatus = orderNewList.stream().map { x -> return x."status" }.collect(Collectors.toList())

        //旧订单接口
        centerGetAllOrderList.invoke(testContext)
        List<Map> orderOldList = testContext.getResponse().data

        List<String> newList = orderNewList.stream().map { x -> return x."uuid" +"|"+x."sourceCreateTime"+"|"+x."status" }.collect(Collectors.toList())
        List<String> oldList = orderOldList.stream().map { x -> return x."tradeId"+"|"+x."createTime"+"|"+ x."status" }.collect(Collectors.toList())
        newList.sort()
        oldList.sort()
        for(int i=0;i<newList.size();i++){
            assert newList.get(i)==oldList.get(i)
        }
       // assert newList==oldList

//
//        List<String> oldOrderCreatTimes = orderOldList.stream().map { x -> return x."createTime" }.collect(Collectors.toList())
//        List<String> oldOrderIds = orderOldList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
//        List<String> oldOrderStatus = orderOldList.stream().map { x -> return x."status" }.collect(Collectors.toList())
//
//        //断言
//        assert  newOrderIds.size() == oldOrderIds.size()
//        assert newOrderCreatTimes == oldOrderCreatTimes
//        assert newOrderStatus== oldOrderStatus
//       ///assert  newOrderIds == oldOrderIds
//
//      for (int i=0;i<newOrderIds.size();i++) {
//          int b = i + 1
//
//         if( b<newOrderIds.size()){
//             if (newOrderCreatTimes.get(i) == newOrderCreatTimes.get(b) || newOrderCreatTimes.get(i).contains("*")) {
//                 assert newOrderIds.get(0) == oldOrderIds.get(0)
//                 println("时间一样和隐私单，忽略订单号校验")
//
//             }else {
//                 assert newOrderIds.get(i) == oldOrderIds.get(i)
//             }
//
//         }
//
//
//      }






    }

}



package com.miyuan.test.judge

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import org.testng.annotations.Test
import com.miyuan.service.OrderService
import com.miyuan.util.DateUtil

class deleteMysqlOrderTest extends BaseTest{

    @Test(description = "清楚MySQL订单数据" ,groups = ["uat","uat03"],testName = "deleteTime",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteMysql(TestContext testContext){
        String StrlastMonthTime = testContext.lastMonthTime.toString()
        Date lastMonth = DateUtil.strToDate(StrlastMonthTime)
        String strTodayMonth = testContext.TodayMonthTime.toString()
        Date todayMonth = DateUtil.strToDate(strTodayMonth)
        List<Integer> userIds =[11167015

        ]
        for(int i=0;i<userIds.size();i++){
            Integer userId = userIds.get(i)

            //清除订单明细
            Integer count1 = OrderService.deleteOrderIncomeItem(userId)
            println(userId+"订单明细"+count1)
            //清除订单分佣明细
            Integer count2 = OrderService.deleteOrderIncomeItemDetail(userId)
            println(userId+"订单分佣明细"+count2)
            //清除小V预处理数据
            Integer count3 = OrderService.deleteOrderIncomeResultSmall(userId)
            println(userId+"小V预处理数据"+count3)
            //清除大V预处理数据
            Integer count4 = OrderService.deleteOrderIncomeResultBigvip(userId)
            println(userId+"大V预处理数据"+count4)
            //清除这月天统计数据
            Integer count5 = OrderService.deleteDayIncom(userId,todayMonth)
            println(userId+"这个月天统计数据"+count5)
            //清除上个月天统计数据
            Integer count6 = OrderService.deleteDayIncom(userId,lastMonth)
            println(userId+"上个月天统计数据"+count6)
            //清除这月月统计数据
            Integer count7 = OrderService.deleteMonthIncom(userId,todayMonth)
            println(userId+"这个月统计数据"+count7)
            //清除上个月月统计数据
            Integer count8 = OrderService.deleteMonthIncom(userId,lastMonth)
            println(userId+"上个月统计数据"+count8)
            //删除MySQL 总统计数据
            Integer count9 = OrderService.deleteTotalIncom(userId)
            println(userId+"总统计数据"+count9)

        }






    }

}



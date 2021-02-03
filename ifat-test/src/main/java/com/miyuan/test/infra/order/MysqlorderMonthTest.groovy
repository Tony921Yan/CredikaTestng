package com.miyuan.test.infra.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.order.MysqlDbOrderList
import org.testng.annotations.Test

class MysqlorderMonthTest extends BaseTest{
    MysqlDbOrderList mysqldbOrderList = new MysqlDbOrderList()
    @Test(description = "核对oms_com_income_result与MongoDB的数据" ,groups = ["prod","prod"],testName = "TB_MonthItem",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void MysqlorderResultlist(TestContext testContext){

        // item表某月汇总
        mysqldbOrderList.monthCountAssert(testContext)
    }


        }








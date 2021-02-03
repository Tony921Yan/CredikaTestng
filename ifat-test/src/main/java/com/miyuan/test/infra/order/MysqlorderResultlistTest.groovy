package com.miyuan.test.infra.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import org.testng.annotations.Test
import com.miyuan.request.api.order.MysqlDbOrderList


class MysqlorderResultlistTest extends BaseTest{
    MysqlDbOrderList mysqldbOrderList = new MysqlDbOrderList()
    //更改测试用例
    @Test(description = "核对oms_com_income_result与MongoDB的数据" ,groups = ["prod","prod"],testName = "TBorderMysqlList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void MysqlorderResultlist(TestContext testContext){
        //orderResult 表多条订单校验
        mysqldbOrderList.resultDbAssert(testContext)

    }


        }








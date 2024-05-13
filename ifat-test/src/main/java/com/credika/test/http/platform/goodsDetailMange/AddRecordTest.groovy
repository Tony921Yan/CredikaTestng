package com.credika.test.http.platform.goodsDetailMange

import com.credika.biz.request.http.platform.goodsDetailManage.AddRecord
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddRecordTest extends BaseTest {
    AddRecord addRecord = new AddRecord()
    @Test(description = "添加评级 addRecord" ,groups = ["prod","uat"],testName = "addRecord-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addRecord(TestContext testContext){
        addRecord.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "添加备注 addRecord" ,groups = ["prod","uat"],testName = "addRecord-p1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addRecord1(TestContext testContext){
        addRecord.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "添加评级和备注 addRecord" ,groups = ["prod","uat"],testName = "addRecord-p2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addRecord2(TestContext testContext){
        addRecord.invoke(testContext).baseAssert(testContext)
    }
}

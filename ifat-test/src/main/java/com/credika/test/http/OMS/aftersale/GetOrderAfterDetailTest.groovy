package com.credika.test.http.OMS.aftersale
import com.credika.biz.request.http.OMS.aftersale.GetOrderAfterDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderAfterDetailTest extends BaseTest{
    GetOrderAfterDetail getOrderAfterDetail = new GetOrderAfterDetail()
    @Test(description = "获取售后详情 getOrderAfterDetail" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterDetail(TestContext testContext){
        getOrderAfterDetail.invoke(testContext).baseAssert(testContext)
    }
}

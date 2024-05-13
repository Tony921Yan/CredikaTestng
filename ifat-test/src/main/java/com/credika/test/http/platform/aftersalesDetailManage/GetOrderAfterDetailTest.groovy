package com.credika.test.http.platform.aftersalesDetailManage

import com.credika.biz.request.http.platform.aftersalesDetailManage.GetOrderAfterDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderAfterDetailTest extends BaseTest {
    GetOrderAfterDetail getOrderAfterDetail = new GetOrderAfterDetail()
    @Test(description = "获取售后单详情 getOrderAfterDetail" ,groups = ["prod","uat"],testName = "getOrderAfterDetail-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterDetail(TestContext testContext){
        getOrderAfterDetail.invoke(testContext).baseAssert(testContext)
    }
}

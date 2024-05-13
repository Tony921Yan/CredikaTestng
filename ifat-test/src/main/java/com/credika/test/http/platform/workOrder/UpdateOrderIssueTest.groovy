package com.credika.test.http.platform.workOrder
import com.credika.biz.request.http.platform.workOrder.UpdateOrderIssue
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateOrderIssueTest extends BaseTest {
    UpdateOrderIssue updateOrderIssue = new UpdateOrderIssue()
    @Test(description = "订单工单处理-不同意 updateOrderIssue" ,groups = ["prod","uat"],testName = "pageOrderIssue-status1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateOrderIssue1(TestContext testContext){
        updateOrderIssue.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订单工单处理-同意 updateOrderIssue",groups=["prod","uat"],testName = "pageOrderIssue-status2",
           dataProvider ="dataProvider",dataProviderClass = TestData.class)
    public void updateOrderIssue2(TestContext testContext){
        updateOrderIssue.invoke(testContext).baseAssert(testContext)
    }


}


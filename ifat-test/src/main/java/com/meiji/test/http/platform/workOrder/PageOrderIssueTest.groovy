package com.meiji.test.http.platform.workOrder
import com.meiji.biz.request.http.platform.workOrder.PageOrderIssue
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageOrderIssueTest extends BaseTest {
    PageOrderIssue pageOrderIssue = new PageOrderIssue()
    @Test(description = "订单工单分页查询数据-全部 pageOrderIssue" ,groups = ["prod","uat"],testName = "pageOrderIssue-all",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrderIssue(TestContext testContext){
        pageOrderIssue.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订单工单分页查询数据-工单状态(待处理) pageOrderIssue",groups =["prod","uat"] ,testName = "pageOrderIssue-orderStatus0",
    dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrderIssue0(TestContext testContext){
        pageOrderIssue.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订单工单分页查询数据-工单状态(已处理) pageOrderIssue",groups = ["prod","uat"],testName = "pageOrderIssue-orderStatus1",
    dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrderIssue1(TestContext testContext){
        pageOrderIssue.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "订单工单分页查询数据-工单状态(已拒绝) pageOrderIssue",groups =["prod","uat"],testName = "pageOrderIssue-orderStatus2",
    dataProvider = "dataProvider",dataProviderClass =TestData.class)
    public void pageOrderIssue2(TestContext testContext){
        pageOrderIssue.invoke(testContext).baseAssert(testContext)
    }

}


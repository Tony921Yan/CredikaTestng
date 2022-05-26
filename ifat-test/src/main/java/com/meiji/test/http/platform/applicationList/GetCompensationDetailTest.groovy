package com.meiji.test.http.platform.applicationList

import com.meiji.biz.request.http.platform.applicationList.GetCompensationDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCompensationDetailTest extends BaseTest {
    GetCompensationDetail getCompensationDetail = new GetCompensationDetail()
    @Test(description = "获取买贵必赔详情,包含订单信息 和 用户信息 和 审核信息和协商历史 getCompensationDetail" ,groups = ["prod","uat"],testName = "getCompensationDetail-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationDetail(TestContext testContext){
        getCompensationDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }


}

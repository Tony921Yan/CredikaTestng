package com.meiji.test.http.mall.content

import com.meiji.biz.request.http.mall.content.DescribeTaskDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/07 14:22
 * @Vession V2.5
 */
class DescribeTaskDetailTest extends BaseTest{
    DescribeTaskDetail describeTaskDetail = new DescribeTaskDetail()
    @Test(description = "获取任务详情 describeTaskDetail",groups = ["uat","prod"],testName = "describeTaskDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void describeTaskDetail(TestContext testContext){
        describeTaskDetail.invoke(testContext).baseAssert(testContext)
    }
}

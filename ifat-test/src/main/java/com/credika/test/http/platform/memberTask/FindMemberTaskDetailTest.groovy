package com.credika.test.http.platform.memberTask

import com.credika.biz.request.http.platform.memberTask.FindMemberTaskDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindMemberTaskDetailTest extends BaseTest {
    FindMemberTaskDetail findMemberTaskDetail = new FindMemberTaskDetail()
    @Test(description = "会员任务详情" ,groups = ["prod","uat"],testName = "findMemberTaskDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void findMemberTaskDetail(TestContext testContext){
        findMemberTaskDetail.invoke(testContext).baseAssert(testContext)

    }

}

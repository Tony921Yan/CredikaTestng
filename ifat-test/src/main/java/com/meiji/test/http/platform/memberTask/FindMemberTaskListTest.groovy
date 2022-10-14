package com.meiji.test.http.platform.memberTask

import com.meiji.biz.request.http.platform.memberTask.FindMemberTaskList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindMemberTaskListTest extends BaseTest {
    FindMemberTaskList findMemberTaskList = new FindMemberTaskList()
    @Test(description = "会员任务分页查询" ,groups = ["prod","uat"],testName = "findMemberTaskList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void findMemberTaskList(TestContext testContext){
        findMemberTaskList.invoke(testContext).baseAssert(testContext)

    }

}

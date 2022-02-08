package com.meiji.biz.request.http.mall.integral
import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext
class UserTaskInfoQuery extends MallPost{
    {
        super.api = "integral/userTaskInfoQuery"
        super.params=["userId"]
    }

    UserTaskInfoQuery invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    UserTaskInfoQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    UserTaskInfoQuery specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.signInTaskInfo)
        System.out.println("apiResult"+apiResult.signInTaskInfo.getAt("todaySignInFlag"))
        System.out.println("apiResult"+apiResult.signInTaskInfo.getAt("continuousDays"))
        Map mysqlResult = MysqlService.userTaskInfoQuery(testContext.get("userId")).get(0)
        System.out.println("mysqlResult"+mysqlResult)
        assert mysqlResult.task_id == apiResult.taskInfo.getAt(0).getAt("taskId")
        assert mysqlResult.task_limit_times == apiResult.taskInfo.getAt(0).getAt("taskLimitTimes")
        assert mysqlResult.task_need_complete_times == apiResult.taskInfo.getAt(0).getAt("taskNeedCompleteTimes")
//        assert mysqlResult.user_complete_times == apiResult.taskInfo.getAt(0).getAt("userCompleteTimes")
        return this
}
}
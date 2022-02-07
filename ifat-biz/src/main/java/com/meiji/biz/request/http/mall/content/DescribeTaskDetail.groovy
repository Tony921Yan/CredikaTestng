package com.meiji.biz.request.http.mall.content

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy* @date 2022/02/07 14:00
 * @Vession V2.5
 */
class DescribeTaskDetail extends MallPost{
    {
        super.api = "orderExhibit/describeTaskDetail"
        super.params = ["taskId"]
    }

    DescribeTaskDetail invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    DescribeTaskDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}

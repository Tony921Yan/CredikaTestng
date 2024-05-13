package com.credika.test.http.mall.welfareCenter
import com.credika.biz.request.http.mall.welfareCenter.MemberTaskRewardRemind
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MemberTaskRewardRemindTest extends BaseTest {
    MemberTaskRewardRemind memberTaskRewardRemind = new MemberTaskRewardRemind()
    @Test(description = "支付成功页面-查询会员福利" ,groups = ["prod","uat"],testName = "",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void memberTaskQuery(TestContext testContext){
        memberTaskRewardRemind.invoke(testContext).baseAssert(testContext)
    }
}

package com.meiji.test.http.mall.newVip


import com.meiji.biz.request.http.mall.newVip.GetActivity
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetActivityTest extends BaseTest {
    GetActivity getActivity = new GetActivity()
    @Test(description = "查询新会员专区活动 getActivity" ,groups = ["prod","uat"],testName = "getActivity",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActivity(TestContext testContext){
        getActivity.invoke(testContext).baseAssert(testContext)
    }
}
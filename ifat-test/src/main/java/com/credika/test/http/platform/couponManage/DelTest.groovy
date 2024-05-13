package com.credika.test.http.platform.couponManage

import com.credika.biz.request.http.platform.couponManage.Del
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DelTest extends BaseTest {
    Del del = new Del()
    @Test(description = "结束优惠券 del" ,groups = ["prod","uat"],testName = "del",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void del(TestContext testContext){
        del.invoke(testContext).baseAssert(testContext)
    }

}
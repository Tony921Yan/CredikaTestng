package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.GoodsSubject
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GoodsSubjectTest extends BaseTest {
    GoodsSubject goodsSubject = new GoodsSubject()
    @Test(description = "商品专题 goodsSubject" ,groups = ["prod","uat"],testName = "goodsSubject",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodsSubject(TestContext testContext){
        goodsSubject.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

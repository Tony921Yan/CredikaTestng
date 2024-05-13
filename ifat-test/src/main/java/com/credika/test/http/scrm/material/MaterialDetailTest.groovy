package com.credika.test.http.scrm.material

import com.credika.biz.request.http.scrm.material.MaterialDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-11:27
 */
class MaterialDetailTest extends BaseTest {
    MaterialDetail material = new MaterialDetail()

    @Test(description = "素材详情", groups = ["prod", "uat"], testName = "materialdetail",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        material.invoke(testContext).baseAssert(testContext)
    }
}

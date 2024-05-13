package com.credika.test.http.scrm.material

import com.credika.biz.request.http.scrm.material.MaterialUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-11:31
 */
class MaterialUpdateTest extends BaseTest {
    MaterialUpdate material = new MaterialUpdate()

    @Test(description = "编辑素材", groups = ["prod", "uat"], testName = "materialupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        material.invoke(testContext).baseAssert(testContext)
    }
}

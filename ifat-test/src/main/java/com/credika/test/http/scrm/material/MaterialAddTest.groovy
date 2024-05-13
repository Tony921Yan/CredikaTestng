package com.credika.test.http.scrm.material

import com.credika.biz.request.http.scrm.material.MaterialAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-11:06
 */
class MaterialAddTest extends BaseTest {
    MaterialAdd material = new MaterialAdd()

    @Test(description = "新增素材", groups = ["prod", "uat"], testName = "materialadd",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        material.invoke(testContext).baseAssert(testContext)
    }
}

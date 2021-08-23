package com.meiji.test.http.scrm.material

import com.meiji.biz.request.http.scrm.material.MaterialList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-16:51
 */
class MaterialListTest extends BaseTest {
    MaterialList materialList = new MaterialList()

    @Test(description = "素材列表", groups = ["prod", "uat"], testName = "materiallist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        materialList.invoke(testContext).baseAssert(testContext)
    }
}

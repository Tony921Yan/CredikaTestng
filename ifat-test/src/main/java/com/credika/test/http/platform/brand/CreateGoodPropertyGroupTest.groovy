package com.credika.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.brand.CreateGoodPropertyGroup
import org.testng.annotations.Test

class CreateGoodPropertyGroupTest extends BaseTest {
    CreateGoodPropertyGroup createGoodPropertyGroup = new CreateGoodPropertyGroup()
    @Test(description = "创建商品属性组 createGoodPropertyGroup" ,groups = ["prod","uat"],testName = "createGoodPropertyGroup",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createGoodPropertyGroup(TestContext testContext){
        createGoodPropertyGroup.invoke(testContext).baseAssert(testContext)
    }
}

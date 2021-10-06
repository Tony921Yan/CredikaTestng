package com.meiji.test.http.platform.other


import com.meiji.biz.request.http.platform.other.GetListMaterials
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetListMaterialsTest extends BaseTest {
    GetListMaterials getListMaterials = new GetListMaterials()
    @Test(description = "美粉圈-素材列表 getListMaterials" ,groups = ["prod","uat"],testName = "getListMaterials",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getListMaterials(TestContext testContext){
        getListMaterials.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}

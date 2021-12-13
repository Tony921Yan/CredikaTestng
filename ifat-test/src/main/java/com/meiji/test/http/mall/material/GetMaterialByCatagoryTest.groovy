package com.meiji.test.http.mall.material

import com.meiji.biz.request.http.mall.material.GetMaterialByCatagory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class GetMaterialByCatagoryTest extends BaseTest {
    GetMaterialByCatagory getMaterialByCatagory = new GetMaterialByCatagory()
    @Test(description = "获取分类下的素材 getMaterialByCatagory" ,groups = ["prod","uat"],testName = "getMaterialByCatagory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMaterialByCatagory(TestContext testContext){
        getMaterialByCatagory.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取分类下的素材-第2页 getMaterialByCatagory" ,groups = ["prod","uat"],testName = "getMaterialByCatagory2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMaterialByCatagory2(TestContext testContext){
        getMaterialByCatagory.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取分类下的素材-第3页 getMaterialByCatagory" ,groups = ["prod","uat"],testName = "getMaterialByCatagory3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMaterialByCatagory3(TestContext testContext){
        getMaterialByCatagory.invoke(testContext).baseAssert(testContext)
    }
}

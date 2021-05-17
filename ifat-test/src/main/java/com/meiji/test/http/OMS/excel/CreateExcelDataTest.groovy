package com.meiji.test.http.OMS.excel

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.OMS.excel.CreateExcelData
import com.meiji.request.http.brand.BrandDetail
import org.testng.annotations.Test

class CreateExcelDataTest extends BaseTest {
    CreateExcelData createExcelData = new CreateExcelData()
    @Test(description = "批量插入数据 createExcelData" ,groups = ["prod","uat"],testName = "createExcelData",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createExcelData(TestContext testContext){
        createExcelData.invoke(testContext).baseAssert(testContext)
    }
}

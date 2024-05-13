package com.credika.test.http.platform.activeMainManage

import com.credika.biz.request.http.platform.activeMainManage.SavePromotionalInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SavePromotionalInfoTest extends BaseTest{
    SavePromotionalInfo savePromotionalInfo = new SavePromotionalInfo()
    @Test(description = "推广-保存推广信息" ,groups = ["prod","uat"],testName = "savePromotionalInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void savePromotionalInfo(TestContext testContext){
        savePromotionalInfo.invoke(testContext).baseAssert(testContext)
//        savePromotionalInfo.specialAssert(testContext)
    }
}

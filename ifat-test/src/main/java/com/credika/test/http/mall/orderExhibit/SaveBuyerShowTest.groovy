package com.credika.test.http.mall.orderExhibit

import com.credika.biz.request.http.mall.orderExhibit.SaveBuyerShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/05 22:56
 * @Vession V2.5
 */
class SaveBuyerShowTest extends BaseTest{
    SaveBuyerShow saveBuyerShow = new SaveBuyerShow()
    @Test(description = "保存晒单（对于未购买进行晒单无效）saveBuyerShow",groups = ["uat","prod"],testName = "saveBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void saveBuyerShow(TestContext testContext){
        saveBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}

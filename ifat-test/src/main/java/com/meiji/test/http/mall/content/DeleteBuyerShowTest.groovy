package com.meiji.test.http.mall.content

import com.meiji.biz.request.http.mall.content.DeleteBuyerShow
import com.meiji.biz.request.http.mall.content.PublishWithoutOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy* @date 2022/01/06 22:38
 * @Vession V2.4
 */
class DeleteBuyerShowTest extends BaseTest{
    DeleteBuyerShow deleteBuyerShow = new DeleteBuyerShow()
    @Test(description = "删除晒单 deleteBuyerShow",groups = ["prod","uat"],testName = "deleteBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteBuyerShow(TestContext testContext){
        deleteBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}

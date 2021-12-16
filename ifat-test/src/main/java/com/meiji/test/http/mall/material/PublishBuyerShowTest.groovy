package com.meiji.test.http.mall.material

import com.meiji.biz.request.http.mall.material.PublishBuyerShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/16 22:32
 @version v2.3
 */
class PublishBuyerShowTest extends BaseTest {
    PublishBuyerShow publishBuyerShow = new PublishBuyerShow()
    @Test(description = "发布晒物 publishBuyerShow" ,groups = ["prod","uat"],testName = "publishBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void publishBuyerShow(TestContext testContext){
        publishBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}

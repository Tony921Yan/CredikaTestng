package com.meiji.test.http.platform.live
import com.meiji.biz.request.http.platform.live.PageLiveCamera
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageLiveCameraTest extends BaseTest {
    PageLiveCamera pageLiveCamera = new PageLiveCamera()
    @Test(description = "查询直播设备 pageLiveCamera" ,groups = ["prod","uat"],testName = "pageLiveCamera",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLiveCamera(TestContext testContext){
        pageLiveCamera.invoke(testContext).baseAssert(testContext)
        pageLiveCamera.specialAssert(testContext)
    }
}

package com.meiji.test.http.mall.live

import com.meiji.biz.request.http.mall.live.LiveLike
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/01/27 18:37
 * @Vession V2.5
 */
class LiveLikeTest extends BaseTest{
    LiveLike liveLike = new LiveLike()
   @Test(description = "直播卡片点赞 liveLike",groups = ["uat","prod"],testName = "liveLike",
        dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void liveLike(TestContext testContext){
       liveLike.invoke(testContext).baseAssert(testContext)
   }
}

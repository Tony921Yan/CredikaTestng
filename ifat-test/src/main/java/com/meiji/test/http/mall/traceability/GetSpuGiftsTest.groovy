package com.meiji.test.http.mall.traceability
import com.meiji.biz.request.http.mall.traceability.GetSpuGifts
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author TonyYan
 * * @date 2023/01/03
 * @Vession V3.7
 * */
class GetSpuGiftsTest extends BaseTest {
    GetSpuGifts getSpuGifts = new GetSpuGifts()
    @Test(description = "查询商品送礼好物 getSpuGifts" ,groups = ["prod","uat"],testName = "getSpuGifts",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSpuGifts(TestContext testContext){
        testContext.put("spuId", MysqlService.getSpuGifts().get(0))
        getSpuGifts.invoke(testContext).baseAssert(testContext)
    }
}
package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.GetOrderLogisticsInfoByCodes
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/01/29 18:43
 * @Vession V2.5
 */
class GetOrderLogisticsInfoByCodesTest extends BaseTest{
    GetOrderLogisticsInfoByCodes getOrderLogisticsInfoByCodes = new GetOrderLogisticsInfoByCodes()
    @Test(description = "批量获取物流信息(我收到的-领取详情物流地址） getOrderLogisticsInfoByCodes",groups = ["uat","prod"],testName = "getOrderLogisticsInfoByCodes",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderLogisticsInfoByCodes(TestContext testContext){
        getOrderLogisticsInfoByCodes.invoke(testContext).baseAssert(testContext)
    }
}

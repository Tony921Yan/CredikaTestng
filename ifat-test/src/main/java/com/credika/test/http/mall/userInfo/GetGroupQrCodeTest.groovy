package com.credika.test.http.mall.userInfo

import com.credika.biz.request.http.mall.user.GetGroupQrCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession V2.6.3
 * */
class GetGroupQrCodeTest extends BaseTest {
    GetGroupQrCode getGroupQrCode = new GetGroupQrCode()
    @Test(description = "获取群二维码 getGroupQrCode" ,groups = ["prod","uat"],testName = "getGroupQrCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGroupQrCode(TestContext testContext){
        getGroupQrCode.invoke(testContext).baseAssert(testContext)
    }
}

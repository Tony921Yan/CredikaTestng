package com.credika.test.http.platform.channel

import com.credika.biz.request.http.platform.channel.GetChannelColumn
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetChannelColumnTest extends BaseTest { //V2.1接口调通，V2.2未发现此接口，确认是否弃用
    GetChannelColumn getChannelColumn = new GetChannelColumn()
    @Test(description = "查询频道栏目 getChannelColumn" ,groups = ["prod","uat"],testName = "getChannelColumn",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelColumn(TestContext testContext){
        getChannelColumn.invoke(testContext).baseAssert(testContext)
    }
}

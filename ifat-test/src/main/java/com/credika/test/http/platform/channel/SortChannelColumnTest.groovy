package com.credika.test.http.platform.channel


import com.credika.biz.request.http.platform.channel.SortChannelColumn
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SortChannelColumnTest extends BaseTest {
    SortChannelColumn sortChannelColumn = new SortChannelColumn()
    @Test(description = "频道栏目排序 sortChannelColumn" ,groups = ["prod","uat"],testName = "sortChannelColumn",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void sortChannelColumn(TestContext testContext){
        sortChannelColumn.invoke(testContext).baseAssert(testContext)
    }
}

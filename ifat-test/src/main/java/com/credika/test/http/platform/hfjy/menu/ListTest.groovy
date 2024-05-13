package com.credika.test.http.platform.hfjy.menu
import com.credika.biz.request.http.platform.hfjy.menu.List
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListTest extends BaseTest {
    List list = new List()
    @Test(description = "菜单列表查询 page" ,groups = ["prod","uat"],testName = "page",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list(TestContext testContext){
//        list.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
        list.invoke(testContext).baseAssert(testContext)
    }
}
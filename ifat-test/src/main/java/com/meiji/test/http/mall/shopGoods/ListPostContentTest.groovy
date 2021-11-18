package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.ListPostContent
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-13:50
 @version v2.1
 */
class ListPostContentTest extends BaseTest{
    ListPostContent listPostContent = new ListPostContent()
    @Test(description = "查询精选晒单 listPostContent" ,groups = ["prod","uat"],testName = "listPostContent",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listPostContent(TestContext testContext){
        listPostContent.invoke(testContext).baseAssert(testContext)
    }
}

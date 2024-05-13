package com.credika.test.http.mall.shopGoods

import com.credika.biz.request.http.mall.shopGoods.FindGoodsTopicDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindGoodsTopicDetailTest extends BaseTest {
    FindGoodsTopicDetail findGoodsTopicDetail = new FindGoodsTopicDetail()
    @Test(description = "根据专题id查询专题信息 findGoodsTopicDetail" ,groups = ["prod","uat"],testName = "findGoodsTopicDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findGoodsTopicDetail(TestContext testContext){
        findGoodsTopicDetail.invoke(testContext).baseAssert(testContext)
    }
}

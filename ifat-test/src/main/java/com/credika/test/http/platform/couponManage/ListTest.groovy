package com.credika.test.http.platform.couponManage

import com.credika.biz.request.http.platform.couponManage.List
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListTest extends BaseTest {
   List list = new List()
    Random rand = new Random()
    @Test(description = "优惠券列表-全部 list" ,groups = ["prod","uat"],testName = "couponManage.list",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "优惠券列表-券状态tab list1" ,groups = ["prod","uat"],testName = "couponManage.list1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list1(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("status", rand.nextInt(4)+1)    //1.未生效；2.生效中; 3.已作废；4.已过期
        list.invoke(testContext).baseAssert(testContext)
    }


    @Test(description = "优惠券列表-券类型 list2" ,groups = ["prod","uat"],testName = "couponManage.list2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list2(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("discountType", rand.nextInt(3)+1)    //1.满减券；2.折扣券; 3.无门槛
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "优惠券列表-券有效期 list" ,groups = ["prod","uat"],testName = "couponManage.list3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list3(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }



}
package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.List
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListTest extends BaseTest {
    List list = new List()
    Random rand = new Random()
    @Test(description = "领券活动查询-全部 list" ,groups = ["prod","uat"],testName = "activeMainManage.list",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "领券活动查询-活动状态 list" ,groups = ["prod","uat"],testName = "activeMainManage.list1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list1(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("type",9)
        testContext.put("status", rand.nextInt(6)+1)    //1.待提交；2.待发布; 3.未开始；4.进行中；5.已结束；6.已取消
        list.invoke(testContext).baseAssert(testContext)
    }


    @Test(description = "领券活动查询-活动名称 list" ,groups = ["prod","uat"],testName = "activeMainManage.list2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list2(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "领券活动查询-活动id list" ,groups = ["prod","uat"],testName = "activeMainManage.list3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list3(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "领券活动查询-活动时间 list" ,groups = ["prod","uat"],testName = "activeMainManage.list4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list4(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动管理-查询秒杀活动列表" ,groups = ["prod","uat"],testName = "activeMainManage.list5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list5(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }
}
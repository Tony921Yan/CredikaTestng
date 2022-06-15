package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.List
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListTest extends BaseTest {
    List list = new List()
    Random rand = new Random()
    @Test(description = "活动列表-全部 list" ,groups = ["prod","uat"],testName = "activeMainManage.list",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-领券活动 list" ,groups = ["prod","uat"],testName = "activeMainManage.list00",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list1(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("type",9)
        testContext.put("status", rand.nextInt(6)+1)    //1.待提交；2.待发布; 3.未开始；4.进行中；5.已结束；6.已取消
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-店长拉新 list" ,groups = ["prod","uat"],testName = "activeMainManage.list01",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list01(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("type",7)
        testContext.put("status", rand.nextInt(6)+1)    //1.待提交；2.待发布; 3.未开始；4.进行中；5.已结束；6.已取消
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-抽奖活动 list" ,groups = ["prod","uat"],testName = "activeMainManage.list02",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list02(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("type",8)
        testContext.put("status", rand.nextInt(6)+1)    //1.待提交；2.待发布; 3.未开始；4.进行中；5.已结束；6.已取消
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-粉丝专享 list" ,groups = ["prod","uat"],testName = "activeMainManage.list03",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list03(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("type",10)
        testContext.put("status", rand.nextInt(6)+1)    //1.待提交；2.待发布; 3.未开始；4.进行中；5.已结束；6.已取消
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-秒杀活动 list" ,groups = ["prod","uat"],testName = "activeMainManage.list04",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list04(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("type",11)
        testContext.put("status", rand.nextInt(6)+1)    //1.待提交；2.待发布; 3.未开始；4.进行中；5.已结束；6.已取消
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-粉丝新人券 list" ,groups = ["prod","uat"],testName = "activeMainManage.list05",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list05(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("type",12)
        testContext.put("status", rand.nextInt(6)+1)    //1.待提交；2.待发布; 3.未开始；4.进行中；5.已结束；6.已取消
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-活动名称 list" ,groups = ["prod","uat"],testName = "activeMainManage.list2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list2(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-活动id list" ,groups = ["prod","uat"],testName = "activeMainManage.list3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list3(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-活动时间 list" ,groups = ["prod","uat"],testName = "activeMainManage.list4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list4(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动列表-通过拼团活动筛选" ,groups = ["prod","uat"],testName = "activeMainManage.list6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list5(TestContext testContext){
        testContext.put("type",14)
        list.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
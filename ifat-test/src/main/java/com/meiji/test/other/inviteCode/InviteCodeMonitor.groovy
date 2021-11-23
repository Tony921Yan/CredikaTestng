package com.meiji.test.other.inviteCode

import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class InviteCodeMonitor  extends BaseTest{
    @Test(dataProvider = "shopData",groups = ["prod"])
    void inviteCode(TestContext testContext){
        Long shopId = Long.valueOf((String)testContext.shopId)
        String shopName = testContext.shop_name
        testContext.appendLog(new Record("店铺Id",shopId))
        testContext.appendLog(new Record("店铺名称",shopName))
        Integer inviteCodeNum = MysqlService.getInviteCodeNum(shopId)
        assert inviteCodeNum > 0,"shopName:" + shopName
    }

    @DataProvider
    TestContext[] shopData(){
        List shopList = MysqlService.getShops()
        List testContextList = new ArrayList()
        shopList.forEach{it->
            TestContext testContext = new TestContext()
            testContext.put("shopId",it.id)
            testContext.put("shop_name",it.shop_name)
            testContext.put("description",it.shop_name)
            testContextList.add(testContext)
        }
        return testContextList
    }
}

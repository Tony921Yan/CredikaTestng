package com.meiji.test.other.account

import com.meiji.biz.request.http.platform.finance.AccountAssetPageQuery
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class AccountMonitor extends BaseTest{
    AccountAssetPageQuery accountAssetPageQuery = new AccountAssetPageQuery()

    @Test(dataProvider = "shopAccountData",groups = ["prod"])
    void shopAccountMonitor(TestContext testContext){
        testContext.appendLog(new Record("shopCode",testContext.shopCode))
        testContext.appendLog(new Record("shopName",testContext.shopName))
        accountAssetPageQuery.invoke(testContext).baseAssert(testContext)
        List<Map> apiResult = testContext.getResponse().data.dataList
        assert apiResult != null
        Map result = apiResult.get(0)
        Integer totalIncome = result.get("totalIncome")==null?0:Integer.valueOf(result.get("totalIncome").toString())
        Integer withdrawAmount = result.get("withdrawAmount")==null?0:Integer.valueOf(result.get("withdrawAmount").toString())
        Integer unSettledAmount = result.get("unSettledAmount")==null?0:Integer.valueOf(result.get("unSettledAmount").toString())
        Integer alreadyWithdrawAmount = result.get("alreadyWithdrawAmount")==null?0:Integer.valueOf(result.get("alreadyWithdrawAmount").toString())
        //Map allAccountUpdateData = TestData.getTestData("allAccountUpdateData_platform")
        //Integer updateValue = allAccountUpdateData.get(testContext.shopCode)==null?0:Integer.parseInt(allAccountUpdateData.get(testContext.shopCode).toString())
        assert totalIncome == withdrawAmount + unSettledAmount + alreadyWithdrawAmount // + updateValue
    }

    @Test(dataProvider = "supplierAccountData",groups = ["prod"])
    void supplierAccountMonitor(TestContext testContext){
        testContext.appendLog(new Record("supplierCode",testContext.supplierCode))
        testContext.appendLog(new Record("supplierName",testContext.supplierName))
        accountAssetPageQuery.invoke(testContext).baseAssert(testContext)
        List<Map> apiResult = testContext.getResponse().data.dataList
        assert apiResult != null
        Map result = apiResult.get(0)
        Integer totalIncome = result.get("totalIncome")==null?0:Integer.valueOf(result.get("totalIncome").toString())
        Integer withdrawAmount = result.get("withdrawAmount")==null?0:Integer.valueOf(result.get("withdrawAmount").toString())
        Integer unSettledAmount = result.get("unSettledAmount")==null?0:Integer.valueOf(result.get("unSettledAmount").toString())
        Integer alreadyWithdrawAmount = result.get("alreadyWithdrawAmount")==null?0:Integer.valueOf(result.get("alreadyWithdrawAmount").toString())
        assert totalIncome == withdrawAmount + unSettledAmount + alreadyWithdrawAmount
    }

    @DataProvider
    TestContext[] shopAccountData() {
        List testContextList = new ArrayList()
        Map commonData = TestData.getCommonData()
        List shopAccountList = MysqlService.getShopAccountData()
        for (Map map : shopAccountList) {
            TestContext testContext = new TestContext()
            testContext.putAll(commonData)
            Map condition = new HashMap()
            condition.put("accountCode",map.shop_code)
            condition.put("merchantType","1")
            testContext.put("condition",condition)
            testContext.put("page",1)
            testContext.put("rows",1)
            testContext.put("shopCode", map.shop_code)
            testContext.put("shopName", map.shop_name)
            testContext.put("description", map.shop_name + "[" + map.shop_code + "]")
            testContextList.add(testContext)
        }
        return testContextList
    }
    @DataProvider
    TestContext[] supplierAccountData() {
        List testContextList = new ArrayList()
        Map commonData = TestData.getCommonData()
        List supplierAccountList = MysqlService.getSupplierAccountData()
        for(Map map:supplierAccountList){
            TestContext testContext = new TestContext()
            testContext.putAll(commonData)
            Map condition = new HashMap()
            condition.put("accountCode",map.supplier_code)
            condition.put("merchantType","2")
            testContext.put("condition",condition)
            testContext.put("page",1)
            testContext.put("rows",1)
            testContext.put("supplierCode",map.supplier_code)
            testContext.put("supplierName",map.supplier_name)
            testContext.put("description", map.supplier_name+"["+map.supplier_code+"]")
            testContextList.add(testContext)
        }
        return testContextList
    }
}

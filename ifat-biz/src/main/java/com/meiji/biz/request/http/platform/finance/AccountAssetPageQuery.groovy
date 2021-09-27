package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import com.miyuan.ifat.support.test.TestData

class AccountAssetPageQuery extends PlatformPost{
    {
        super.api="AccountAssets/accountAssetPageQuery"
        super.params = ["condition","order","page","rows","sort"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    PlatformPost specialAssert(TestContext testContext){
        List<Map> apiResult = testContext.getResponse().data.dataList
        Map allAccountUpdateData = TestData.getTestData("allAccountUpdateData_platform")
        List errorList = new ArrayList()
        for (Map map:apiResult){
            String accountCode = map.get("accountCode")
            List accList = ["shop112104022025"]
            if(accList.contains(accountCode)) {
                continue
            }
            Integer totalIncome = Integer.valueOf(map.get("totalIncome").toString())
            Integer withdrawAmount = Integer.valueOf(map.get("withdrawAmount").toString())
            Integer unSettledAmount = Integer.valueOf(map.get("unSettledAmount").toString())
            Integer alreadyWithdrawAmount = map.get("alreadyWithdrawAmount") == null ? 0 : Integer.valueOf(map.get("alreadyWithdrawAmount"))

            Integer updateValue = allAccountUpdateData.get(accountCode)==null ? 0 :Integer.valueOf(allAccountUpdateData.get(accountCode).toString())
            if(updateValue != (totalIncome - withdrawAmount - unSettledAmount - alreadyWithdrawAmount)){
                Map msg = new HashMap()
                msg.put("accountCode",accountCode)
                msg.put("diff",totalIncome - withdrawAmount - unSettledAmount - alreadyWithdrawAmount-updateValue)
                errorList.add(msg)
                testContext.appendLog(new Record("供应商/小B数据修正补差后仍不相等", msg))
            }
           // assert updateValue == (totalIncome - withdrawAmount - unSettledAmount - alreadyWithdrawAmount),"供应商/小B数据修正补差后仍不相等"+map.get("accountCode")
        }
        assert errorList.size() == 0

//        int count =0
//
//            for (i in 0..<apiResult.size()) {
//            Map map = apiResult.get(i)
//            Integer totalIncome = map.get("totalIncome")
//            Integer withdrawAmount = map.get("withdrawAmount")
//            Integer unSettledAmount = map.get("unSettledAmount")
//            Integer alreadyWithdrawAmount
//            String accountName = map.get("accountName")
//            if(map.get("alreadyWithdrawAmount") == null){alreadyWithdrawAmount =0
//            }else{alreadyWithdrawAmount = map.get("alreadyWithdrawAmount")}
//
//            if(totalIncome==withdrawAmount+unSettledAmount+alreadyWithdrawAmount){
//                assert totalIncome==withdrawAmount+unSettledAmount+alreadyWithdrawAmount
//                testContext.appendLog(new Record("以下供应商/小B数据相等（不需要补差）",accountName))}
//            else {
//                Map allAccountUpdateData = TestData.getTestData("allAccountUpdateData_platform")
//                Iterator<Map.Entry<String, String>> it = allAccountUpdateData.entrySet().iterator()
//                Integer updateValue
//                while (it.hasNext()) {
//                    Map.Entry<String, String> entry = it.next()
////                System.out.println("key="+entry.getKey()+","+"value="+entry.getValue())
//                    if (map.get("accountCode") == entry.getKey()) {
//                        updateValue = Integer.valueOf(entry.getValue().toString())
//                        System.out.println("updateValue：" + updateValue)
//                        if (updateValue == (totalIncome - withdrawAmount - unSettledAmount - alreadyWithdrawAmount)) {
//                            assert updateValue == (totalIncome - withdrawAmount - unSettledAmount - alreadyWithdrawAmount)
//                            testContext.appendLog(new Record("以下供应商/小B数据修正补差相等（需要补差才相等）", accountName))
//                        } else {
//                            assert updateValue != (totalIncome - withdrawAmount - unSettledAmount - alreadyWithdrawAmount)
//                            testContext.appendLog(new Record("以下供应商/小B数据修正补差后仍不相等", accountName))
//                        }
//                    }
//                }
//            }
//            count++
//            }
//        testContext.appendLog(new Record("统计供应商/小B的数据条数", count))
        }

    PlatformPost getallAccountData(TestContext testContext){
        List<Map> apiResult = testContext.getResponse().data.getAt("dataList")
        Integer count =0
        for (i in 0..<apiResult.size()) {
            Map map = apiResult.get(i)
            Integer totalIncome = (Integer) map.get("totalIncome")
            Integer withdrawAmount = (Integer) map.get("withdrawAmount")
            Integer unSettledAmount = (Integer) map.get("unSettledAmount")
            Integer alreadyWithdrawAmount
            Integer updateValue
            if (map.get("alreadyWithdrawAmount") == null) {
                alreadyWithdrawAmount = 0
            } else {
                alreadyWithdrawAmount = (Integer) map.get("alreadyWithdrawAmount")
            }

            if (totalIncome != withdrawAmount + unSettledAmount + alreadyWithdrawAmount) {
                updateValue = totalIncome - withdrawAmount - unSettledAmount - alreadyWithdrawAmount
                System.out.println("<" + "parm key=" + '"' + map.get("accountCode") + '"' + ' value="' +updateValue + '"/>' )
                count++
                }
            }
        testContext.appendLog(new Record("总资产（供应商/小B）有差额的个数为",count))
        return this
    }
}

package com.credika.biz.request.http.mall.inviteCode

import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class FindInviteCodeList extends MallPost {
    {
        super.api = "/inviteCode/findInviteCodeList"
        super.params =  [ "shopId","page","rows","state"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindInviteCodeList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindInviteCodeList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindInviteCodeList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindInviteCodeList specialAssert(TestContext testContext){
        List<Map> apiResult = testContext.getResponse().data
        List mysqlResult = MysqlService.findInviteCodeList(testContext.get("shopId").toString(),testContext.state)
        assert apiResult.get(0).code == mysqlResult.get(0).code

    }

//    FindInviteCodeList special[](){
//        TestContext testContext = new TestContext()
//        List mysqlResult = MysqlService.findInviteCodeList(testContext.get("shopId"))
//        List list = new ArrayList()
//        System.out.println(mysqlResult)
//        for(Map map:mysqlResult){
//            testContext.put("code",map.get("code").toString())
//            list.add(testContext)
//        }
//        return list
//    }
}

package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.request.http.shop.ShopPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext
import org.apache.commons.lang3.StringUtils

import java.awt.image.ImageProducer

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

        List state = StringUtils.isBlank(testContext.state) ? [0, 1] : [testContext.state]
        List mysqlResult = MysqlService.findInviteCodeList(testContext.get("shopId"),state)
        assert apiResult.get(0).getAt("code") == mysqlResult.get(0).getAt("code")

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

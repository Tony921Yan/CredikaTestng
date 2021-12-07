package com.meiji.test.debug

import com.meiji.test.http.platform.supplier.ListFreightTemplateBySupplierIdTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.miyuan.ifat.support.util.DateUtil
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import java.security.Provider

class UtilDebug {
    @Test
    void test1(){
        println(DateUtil.dateAdd(new Date(),Calendar.DAY_OF_YEAR,1))
    }

    @Test
    void testPost(){
        //String url = "http://127.0.0.1:8080/mall/shop/goods/findShopGoodsDetail"
        String url = "https://mall.meiji8888.com/shopGoods/findShopGoodsDetail"
        TestContext testContext = TestData.getCommonData()
        Map head = new HashMap()
        head.put("timestamp",testContext.get("timestamp"))
        head.put("nonce",testContext.get("nonce"))
        head.put("Content-Type",testContext.get("Content-Type"))
        head.put("isGrayRelease",true)
        UUID uuid = UUID.randomUUID();
        head.put("isUserLogTracing",true)
        head.put("userLogTracingTag",uuid)
        head.put("userId",10053)
        TreeMap req = new TreeMap()
        req.put("spuId","1419204305616928")
        req.put("shopId",1405965664518176)
        for(int i=0;i<1;i++) {
            println("=============== start ========================================")
            println("=============== head ========================================")
            println(JsonUtil.prettyJson(head))
            println("=============== req ========================================")
            println(JsonUtil.prettyJson(req))
            String res = HttpUtil.post(url, head, req)
            println(JsonUtil.prettyJson(res))
            println("=============== end ========================================")
        }

    }
    @DataProvider
    public Object[] getData(){
        List list = new ArrayList()
        for(int i = 0;i<1;i++){
            list.add(i)
        }
        return list
    }
}

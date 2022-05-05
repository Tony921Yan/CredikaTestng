package com.meiji.test.debug


import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.miyuan.ifat.support.util.DateUtil
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class UtilDebug {
    @Test
    void test1(){
        println(DateUtil.dateAdd(new Date(),Calendar.DAY_OF_YEAR,1))
    }

    @Test
    void testPost(){
        //String url = "http://127.0.0.1:8080/mall/shop/findShopById"
        //String url = "http://127.0.0.1:8080/mall/shop/goods/findShopGoodsDetail"
        String url = "http://test.meiji8888.com/mall/shop/goods/findShopGoodsDetail"
        TestContext testContext = TestData.getCommonData()
        Map head = new HashMap()
        //head.put("timestamp",testContext.get("timestamp"))
        //head.put("nonce",testContext.get("nonce"))
        head.put("Content-Type","application/json")
       // head.put("grayReleaseTag","project1")
        UUID uuid = UUID.randomUUID();
        head.put("isUserLogTracing",true)
        head.put("userLogTracingTag",uuid)
        head.put("userLogTracingId","test")
        head.put("userId",10053)
        TreeMap req = new TreeMap()
        req.put("spuId","1419204305616928")
        req.put("shopId",1405965664518176)
       // req.put("id",1)
        //req.put("supplierId","1405965664518176")
        for(int i=0;i<10;i++) {
            println("=============== start ========================================")
            println("=============== head ========================================")
            println(JsonUtil.prettyJson(head))
            println("=============== req ========================================")
            println(JsonUtil.prettyJson(req))
            def res = HttpUtil.post(url, head, req)
            println("=============== res ========================================")
            println(JsonUtil.prettyJson(res.getResp()))
            assert  ["0","05000"].contains(res.getResp().code)
            println("=============== end ========================================")
        }

    }

//    @Test
//    public void test1() {
//        String host = "http://10.0.1.1:8080";
//        String url = host + "/mall/shop/findShopById";
//        for (int i = 0; i < 10; i++) {
//            long t1 = System.currentTimeMillis();
//            HttpResponse s = HttpUtil.createPost(url)
//                    .header("userId", "2")
//                    .body("{\n" +
//                            "    \"id\":1\n" +
//                            "}", "application/json")
//                    .execute();
//            long t2 = System.currentTimeMillis();
//            System.out.println(s.body() + " " + (t2-t1) + "ms");
//        }
//    }
    @DataProvider
    public Object[] getData(){
        List list = new ArrayList()
        for(int i = 0;i<1;i++){
            list.add(i)
        }
        return list
    }
}

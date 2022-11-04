package com.meiji.biz.request.http.OMS.goodsOriginManage
import com.meiji.biz.request.http.OMS.OMSPost
import com.meiji.biz.request.http.platform.integral.List
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException
import java.text.SimpleDateFormat
class GetGoodsByPage extends OMSPost{
    {
        super.api = "/GoodsOriginManage/getGoodsByPage"
        super.params =["status","pageNum","pageSize","supplierId"]

    }

    GetGoodsByPage invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    GetGoodsByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetGoodsByPage afterInvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data.data
        if(apiResult==[]){
            throw new SkipException("OMS待提交状态数据返回为空")
            return null
        }
        println("id"+ apiResult.get(0).getAt("id"))
        testContext.put("id",apiResult.get(0).getAt("id"))
        testContext.put("pics",apiResult.get(0).getAt("pics"))
        testContext.put("text",apiResult.get(0).getAt("text"))
        testContext.put("title",apiResult.get(0).getAt("title"))
       testContext.put("videos",apiResult.get(0).getAt("videos"))
        return this
    }

//    GetGoodsByPage specialAssert(TestContext testContext){
//        ArrayList<List>  apiResult = testContext.getResponse().data.data
//        ArrayList<List>  mysqlResult = MysqlService.getGoodsByPage(testContext.get("supplierId"))
//        println(apiResult.size())
//        assert apiResult.size() == mysqlResult.size()
//        for(int i=0;i<apiResult.size();i++){
////            String a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mysqlResult.get(i).getAt("publish_date"))
////            println "数据库返回：" + a
//            if(mysqlResult.get(i).getAt("id") == apiResult.get(i).getAt("id")){
//                println("测试")
//                assert mysqlResult.get(i).getAt("spu_id") == apiResult.get(i).getAt("spuId")
//                assert mysqlResult.get(i).getAt("spu_code") == apiResult.get(i).getAt("spuCode")
////                if(mysqlResult.get(i).getAt("publish_date") || apiResult.get(i).getAt("publishDate") != null){
////                    String publish_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mysqlResult.get(i).getAt("publish_date"))
////                    assert publish_date ==  apiResult.get(i).getAt("publishDate")
////                }
//            } else{
////                println "数据库返回值与接口返回值不一致，请检查！"
//                assert mysqlResult.size() == apiResult.size()
//            }
//        }
//        return this
//    }

}

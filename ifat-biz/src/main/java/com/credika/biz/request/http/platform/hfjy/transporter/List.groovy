package com.credika.biz.request.http.platform.hfjy.transporter
import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class List extends PlatformPost{
    {
        super.api="/platform/system/transporter/list"
        super.params = ["condition","page","rows"]
    }

    List invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    List preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    List baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    List specialAssert(TestContext testContext){
        ArrayList mysqlResult = MysqlService.transporterList()
        println(mysqlResult)
        ArrayList apiResult =testContext.getResponse().data.dataList
        println(apiResult)
        assert mysqlResult.size() == apiResult.size()
//        assert mysqlResult.get(0).getAt("id") == apiResult.get(0).getAt("id")
//        assert mysqlResult.get(0).getAt("status") == apiResult.get(0).getAt("status")
        for(int i=0;i<apiResult.size();i++){
            if(mysqlResult.get(i).getAt("id") == apiResult.get(i).getAt("id")){
                assert mysqlResult.get(i).getAt("status") == apiResult.get(i).getAt("status")
                assert mysqlResult.get(i).getAt("type") == apiResult.get(i).getAt("type")
                assert mysqlResult.get(i).getAt("name") == apiResult.get(i).getAt("name")
                assert mysqlResult.get(i).getAt("code") == apiResult.get(i).getAt("code")
            }else {
                println "数据库返回值与接口返回值不一致，请检查！"
                assert mysqlResult.size() == apiResult.size()
            }
            return this
        }


    }

}

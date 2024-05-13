package com.credika.biz.request.http.platform.activeMainManage.giftAdvManage


import com.miyuan.ifat.support.test.TestContext

import java.text.SimpleDateFormat

class GiftAdvManageList extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftAdvManage/list"
        super.params = []
    }

    GiftAdvManageList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GiftAdvManageList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GiftAdvManageList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GiftAdvManageList specialAssert(TestContext testContext){
        ArrayList mysqlResult = com.credika.biz.service.MysqlService.giftAdvManageList();
        ArrayList apiResult = testContext.getResponse().data
        assert mysqlResult.size() == apiResult.size()
        for (int i =0; i<apiResult.size();i++){
//            String a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mysqlResult.get(i).getAt("gmt_modified"))
//            println "数据库返回：" + a
            if(mysqlResult.get(i).getAt("id") == apiResult.get(i).getAt("id")){
                assert mysqlResult.get(i).getAt("location") == apiResult.get(i).getAt("location")
                assert mysqlResult.get(i).getAt("source_name") == apiResult.get(i).getAt("sourceName")
                assert mysqlResult.get(i).getAt("status") == apiResult.get(i).getAt("status")
                assert mysqlResult.get(i).getAt("update_by") == apiResult.get(i).getAt("updateBy")
                assert mysqlResult.get(i).getAt("pic") == apiResult.get(i).getAt("pic")
                assert mysqlResult.get(i).getAt("target_active_type") == apiResult.get(i).getAt("targetActiveType")
                assert mysqlResult.get(i).getAt("target_type") == apiResult.get(i).getAt("targetType")
                assert mysqlResult.get(i).getAt("target") == apiResult.get(i).getAt("target")
                if(mysqlResult.get(i).getAt("gmt_modified") || apiResult.get(i).getAt("gmtModified") != null){
                    //在遍历过程中，为避免日期返回null，导致报错Cannot format given Object as a Date，要做过滤
                    String gmt_modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mysqlResult.get(i).getAt("gmt_modified"))
                    assert gmt_modified == apiResult.get(i).getAt("gmtModified")
                }
            }
            else{
                println "数据库返回值与接口返回值不一致，请检查！"
                assert mysqlResult.size() == apiResult.size()
            }
        }
        return this
    }
}

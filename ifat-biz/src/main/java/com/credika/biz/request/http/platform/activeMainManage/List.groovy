package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class List extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "activeMainManage/list"
       super.params = ["type","page","rows","status","name","expiryEnd","expiryStart","id","typeList","statusList"]
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
        Map apiResult = testContext.getResponse().data
        ArrayList<Map> arrayList = new ArrayList<>(apiResult.dataList)
        Map MysqlResult = com.credika.biz.service.MysqlService.getActiveList(testContext.get("type"))
       assert arrayList.getAt(0).id == MysqlResult.id
       assert arrayList.getAt(0).type == MysqlResult.type
       assert arrayList.getAt(0).name == MysqlResult.name
       assert arrayList.getAt(0).status == MysqlResult.status as Integer
       assert arrayList.getAt(0).preTime == MysqlResult.pre_time
        assert com.credika.biz.util.DateUtil.strToDate(arrayList.getAt(0).expiryStart)  == com.credika.biz.util.DateUtil.strToDate(MysqlResult.expiry_start as String)
        assert com.credika.biz.util.DateUtil.strToDate(arrayList.getAt(0).expiryEnd)  == com.credika.biz.util.DateUtil.strToDate(MysqlResult.expiry_end as String)
       assert arrayList.getAt(0).copyWrite == MysqlResult.copy_write
       assert arrayList.getAt(0).activeRule == MysqlResult.active_rule
       assert arrayList.getAt(0).remark == MysqlResult.remark
        assert com.credika.biz.util.DateUtil.strToDate(arrayList.getAt(0).gmtCreate)  == com.credika.biz.util.DateUtil.strToDate(MysqlResult.gmt_create as String)
        assert com.credika.biz.util.DateUtil.strToDate(arrayList.getAt(0).gmtModified)  == com.credika.biz.util.DateUtil.strToDate(MysqlResult.gmt_modified as String)
       assert arrayList.getAt(0).createBy == MysqlResult.create_by
       assert arrayList.getAt(0).posterPic == MysqlResult.poster_pic
       assert arrayList.getAt(0).title == MysqlResult.title
       assert arrayList.getAt(0).groupQrcodeUrl == MysqlResult.group_qrcode_url
       assert arrayList.getAt(0).copyWriteType == MysqlResult.copy_write_type
       assert arrayList.getAt(0).qrCode == MysqlResult.qr_code
        assert com.credika.biz.util.DateUtil.strToDate(arrayList.getAt(0).publishTime)  == com.credika.biz.util.DateUtil.strToDate(MysqlResult.publish_time as String)
    }


}

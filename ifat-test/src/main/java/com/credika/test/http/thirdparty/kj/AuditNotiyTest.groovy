package com.credika.test.http.thirdparty.kj
import com.credika.biz.request.http.thirdparty.kj.AuditNotiy
import com.credika.biz.util.DateUtil
import com.credika.biz.util.KJSign
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import groovy.xml.XmlParser
import org.testng.annotations.Test

class AuditNotiyTest extends BaseTest{
    AuditNotiy auditNotiy = new AuditNotiy()
    @Test(description = "跨境商品订单审核通知 auditNotiy" ,groups = ["uat"],testName = "uat",
            dataProvider = "common",dataProviderClass = TestData.class)
    public void debug(TestContext testContext){
        XmlParser xmlParser = new XmlParser()
        String userCode = "T2020"
        def data = "<request>" +
                "<kjCustomerOutstoreReturn>" +
                "<saleOrderCode>O2022041113430488143</saleOrderCode>" +
                "<logisticsCode>美记测试</logisticsCode>" +
                "<logisticsNumber>1234567890</logisticsNumber>" +
                "<markPlace1>大头笔或集包地</markPlace1>" +
                "<markPlace2>大头笔或三段码</markPlace2>" +
                "<outstoreStatus>90</outstoreStatus>" +
                "<outstoreStatusMsg>测试90状态</outstoreStatusMsg>" +
                "<occurTime>"+  DateUtil.dateToStr(new Date()) +"</occurTime>" +
                "</kjCustomerOutstoreReturn>" +
                "</request>"
        String msgData = Base64.getEncoder().encodeToString(data.getBytes("UTF-8"))
        String msgDigest = KJSign.sign(msgData)
        testContext.put("msgType","KJ_CUSOMER_OUTSTORE_RETURN")
        testContext.put("userCode",userCode)
        testContext.put("msgId",UUID.randomUUID().toString())
        testContext.put("msgData",msgData)
        testContext.put("msgDigest",msgDigest)
        auditNotiy.invoke(testContext)
    }
}

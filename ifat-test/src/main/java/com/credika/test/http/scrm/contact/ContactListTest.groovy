package com.credika.test.http.scrm.contact

import com.credika.biz.request.http.scrm.contact.ContactList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-16:02
 */
class ContactListTest extends BaseTest{
    ContactList contactList = new ContactList()
    @Test(description = "客户列表 contactlist" ,groups = ["prod","uat"],testName = "scrmcontactlist",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        contactList.invoke(testContext).baseAssert(testContext)
    }
}

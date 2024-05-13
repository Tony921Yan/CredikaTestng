package com.credika.biz.request.http.scrm.department

import com.credika.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/18-14:07
 */
class DepartmentUpdate extends ScrmPost{
    {
        super.api = "scrm/department/update"
        super.params=["corpId",
                      "createUserId",
                      "employeeId",
                      "gmtCreate",
                      "gmtModified",
                      "id",
                      "name",
                      "parentId",
                      "state",
                      "updateUserId",
                      "version"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05004"
    }
}

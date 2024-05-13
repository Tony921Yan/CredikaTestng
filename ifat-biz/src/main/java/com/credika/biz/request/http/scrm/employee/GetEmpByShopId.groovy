package com.credika.biz.request.http.scrm.employee

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/9/13-11:41
 */
class GetEmpByShopId extends ScrmGet{
    {
        super.api = "scrm/employee/getEmployeeListByShopId"
        super.params = ["shopId"]
    }
}

package com.credika.biz.request.http.scrm.employee

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-15:44
 */
class ShopPermissionList extends ScrmPost{
    {
        super.api = "scrm/employee/shop_permission_list"
        super.params = ["corpId", "employeeId"]
    }
}

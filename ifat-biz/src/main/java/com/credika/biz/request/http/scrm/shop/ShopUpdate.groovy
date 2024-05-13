package com.credika.biz.request.http.scrm.shop

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-16:37
 */
class ShopUpdate extends ScrmPost{
    {
        super.api = "scrm/shop/update"
        super.params = ["addressId",
                        "corpId",
                        "createUserId",
                        "departId",
                        "employeeId",
                        "gmtCreate",
                        "gmtModified",
                        "id",
                        "manager",
                        "relateStatus",
                        "state",
                        "telephone",
                        "updateUserId",
                        "version"]
    }
}

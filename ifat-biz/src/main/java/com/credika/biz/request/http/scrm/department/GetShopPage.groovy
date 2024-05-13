package com.credika.biz.request.http.scrm.department

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-13:59
 */
class GetShopPage extends ScrmPost{
    {
        super.api = "scrm/department/getShopPage"
        super.params = ["condition",
                        "order",
                        "page",
                        "rows",
                        "sort"]
    }
}

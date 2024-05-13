package com.credika.biz.request.http.scrm.department

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-13:56
 */
class GetShopList extends ScrmPost{
    {
        super.api = "scrm/department/getShopList"
        super.params=["departId",
                      "shopId",
                      "shopName",
                      "type"]
    }
}

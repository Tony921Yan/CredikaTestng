package com.credika.biz.request.http.scrm.shop

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-16:32
 */
class ShopRelate extends ScrmPost{
    {
        super.api = "scrm/shop/relate"
        super.params = ["employeeIds",
                        "groupIds",
                        "shopInfoList"]
    }
}

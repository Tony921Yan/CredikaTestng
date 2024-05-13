package com.credika.biz.request.http.scrm.material

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/9/18-11:26
 */
class MaterialDetail extends ScrmGet{
    {
        super.api = "scrm/material/detail"
        super.params = ["id"]
    }
}

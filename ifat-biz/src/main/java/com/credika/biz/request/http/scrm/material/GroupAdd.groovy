package com.credika.biz.request.http.scrm.material

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-10:53
 */
class GroupAdd extends ScrmPost{
    {
        super.api = "scrm/material/group/add"
        super.params = ["id",
                        "key",
                        "title"]
    }
}

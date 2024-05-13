package com.credika.biz.request.http.scrm.material

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/8/23-16:46
 */
class GroupList extends ScrmGet{
    {
        super.api = "scrm/material/group/list"
        super.params = ["name"]
    }

}

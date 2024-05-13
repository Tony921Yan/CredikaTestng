package com.credika.biz.request.http.scrm.group

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/8/23-17:38
 */
class GetGroupShow extends ScrmGet{
    {
        super.api = "scrm/group/show"
        super.params = ["id"]
    }
}

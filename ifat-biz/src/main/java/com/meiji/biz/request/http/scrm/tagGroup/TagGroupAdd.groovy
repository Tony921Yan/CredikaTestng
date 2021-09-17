package com.meiji.biz.request.http.scrm.tagGroup

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/17-16:29
 */
class TagGroupAdd extends ScrmPost{
    {
        super.api = "scrm/tagGroup/add"
        super.params = ["groupName"]
    }
}

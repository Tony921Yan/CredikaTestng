package com.meiji.biz.request.http.scrm.wx

import com.meiji.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/8/23-14:59
 */
class WxMemberList extends ScrmGet{
    {
        super.api = "scrm/wxDepartment/memberList"
        super.params = ["departmentIds"]
    }
}

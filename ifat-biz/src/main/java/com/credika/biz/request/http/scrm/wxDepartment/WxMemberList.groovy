package com.credika.biz.request.http.scrm.wxDepartment

import com.credika.biz.request.http.scrm.ScrmGet

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

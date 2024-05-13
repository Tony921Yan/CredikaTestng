package com.credika.biz.request.http.scrm.department

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-14:03
 */
class DepartmentRelate extends ScrmPost{
    {
        super.api = "scrm/department/relate"
        super.params = ["departId",
                        "shopIds"]
    }
}

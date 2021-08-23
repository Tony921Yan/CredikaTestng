package com.meiji.biz.request.http.scrm.material

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-16:50
 */
class MaterialList extends ScrmPost{
    {
        super.api = "scrm/material/list"
        super.params = ["condition", "order", "page", "rows", "sort"]
    }
}

package com.meiji.biz.request.http.scrm.menu

import com.meiji.biz.request.http.scrm.ScrmGet
import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/20-14:43
 */
class MenuList extends ScrmGet{
    {
        super.api = "scrm/menu/list"
        super.params = []
    }
}

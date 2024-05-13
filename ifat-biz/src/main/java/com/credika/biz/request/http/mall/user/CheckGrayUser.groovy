package com.credika.biz.request.http.mall.user

import com.credika.biz.request.http.mall.MallPost

class CheckGrayUser extends MallPost{
    {
        super.api = "/user/checkGrayUser"
        super.params =  ["grayUserId"]
    }
}

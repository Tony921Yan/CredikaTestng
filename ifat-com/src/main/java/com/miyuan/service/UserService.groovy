package com.miyuan.service


import com.miyuan.com.TestContext

class UserService {
    static void getUserFromDb(TestContext testContext){
        Map user = MysqlService.getUserInfo(Integer.parseInt(testContext.get("userId").toString()))
        testContext.put("pid",user.get("root_pid"))
        testContext.put("rid",user.get("relation_id"))
        testContext.put("inviteCode",user.get("invite_code"))
        testContext.put("phone",user.get("phone"))
    }
}

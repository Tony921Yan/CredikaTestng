package com.credika.test.tools

import com.miyuan.ifat.support.test.BaseTest
import org.apache.commons.lang3.StringUtils
import org.testng.annotations.Test
import com.credika.biz.api.MysqlAPI

class UserTools extends BaseTest{
    @Test(groups = ["uat"])
    void createUser() {
        String phoneStart = "11"+System.currentTimeMillis().toString().substring(4,10)
        String avatar = "https://thirdwx.qlogo.cn/mmopen/vi_32/sC2rVUic9mHjeLeVY1LWYK8Y33gaqTPCwJHm9rkqbNY10kN1Uhm5OY8A2j3XqQzGg0rFlQD0Wia9sZxDn3nLO4icA/132"
        for (int i = 0; i <300;i++){
            String phoneEnd = StringUtils.leftPad(i.toString(),3,"0")
            String phone = phoneStart+phoneEnd
            String nickname = "测试"+i
            List result = MysqlAPI.meiji_user.executeInsert("insert into user(phone,nickname,avatar,sex,state,is_delete,gmt_create,gmt_modified,source_type) value" +
                    "('$phone','$nickname','$avatar',0,1,0,now(),now(),0)")
            String userId = result.get(0).get(0).toString()
            MysqlAPI.meiji_user.executeInsert("insert into user_identifier(user_id,identity_type,identifier,credential,is_delete,gmt_create,gmt_modified) value" +
                    "('$userId',1,'test$phone','test$phone',0,now(),now())")
            MysqlAPI.meiji_user.executeInsert("INSERT INTO user_address (user_id,recipient,phone,province,province_code,city,city_code,district,district_code,address,id_card_number,remark,is_default,is_last_selected,is_delete,gmt_create,gmt_modified) value" +
                    "('$userId','测试','$phone','广东省','440000','深圳市','440300','南山区','230404','大冲一路 华润置地大厦E座 26楼EF单元',NULL,NULL,1,1,0,now(),now())")
            MysqlAPI.meiji_user.executeInsert("INSERT INTO user_info (user_id,source_type,nickname,avatar,sex,country,province,city,birth_date,is_delete,gmt_create,gmt_modified) value" +
                    "('$userId',1,'$nickname','$avatar',1,'China','Guangdong','Guangzhou',NULL,0,now(),now())")
            println(phone)
        }
    }

}

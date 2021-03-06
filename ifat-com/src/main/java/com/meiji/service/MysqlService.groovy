package com.meiji.service

import com.meiji.api.MysqlAPI

class MysqlService extends MysqlAPI {

    static Map getBrand(String id){
        return platformGoodsSql.firstRow("select * from goods_brand where id = $id")
    }
}

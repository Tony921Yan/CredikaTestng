package com.meiji.service

import com.meiji.api.MysqlAPI

class MysqlService extends MysqlAPI {

    static Map getBrand(String id){
        return platformGoodsSql.firstRow("select * from goods_brand where id = $id")
    }

    static List getCategoryById(String id){
        return platformGoodsSql.rows("select * from goods_category where id=$id")
    }

    static List getCategoryByType(String type){
        return platformGoodsSql.rows("select * from goods_category where  status=1 and type = $type")
    }

    static List getCategory(String type,String name){
        return platformGoodsSql.rows("select * from goods_category where type = $type and name = $name")
    }
}

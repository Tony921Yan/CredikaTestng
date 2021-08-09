package com.meiji.biz.service


import com.meiji.biz.api.MysqlAPI

class MysqlService extends MysqlAPI {

    static Map getBrand(String id){
        return platformGoodsSql.firstRow("select * from goods_brand where id = $id")
    }

    static List getCategoryById(String id){
        return platformGoodsSql.rows("select * from goods_category where id=$id")
    }

    static List getCategoryByType(String type){
        return platformGoodsSql.rows("select * from goods_category where type = $type")
    }

    static List addCategory(String type,String sort){
        return platformGoodsSql.rows("select * from goods_category where type = $type and sort = $sort")
    }

    static List getCategory(String type,String name){
        return platformGoodsSql.rows("select * from goods_category where type = $type and name = $name")
    }

    static List findShopById(String id){
        return prod_meiji_shop.rows("select * from shop where id = $id")
    }

    static  List findShopBusinessInfo(String shop_id){
        System.out.println("print SQL...")
        return prod_meiji_shop.rows("select * from shop_business_info where shop_id = $shop_id")
    }
}

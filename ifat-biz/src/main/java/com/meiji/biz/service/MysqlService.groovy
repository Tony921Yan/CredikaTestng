package com.meiji.biz.service


import com.meiji.biz.api.MysqlAPI

import java.util.stream.Collectors

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
        return prod_meiji_shop.rows("select * from shop_business_info where shop_id = $shop_id")
    }

    static List asset(String shop_id){
        return prod_meiji_settlement.rows("select sum(seller_profit_sharing_price) as TotalPrice from settlement_order where settlement_state =0 and shop_id = $shop_id")
    }

    static List profitSharing(String shop_id){
        return prod_meiji_settlement.rows("SELECT * from settlement_order where shop_id =$shop_id and settlement_state in (0,1) ORDER BY gmt_create DESC LIMIT 10")
    }

    static List findUserInfo(String id){
        return prod_meiji_user.rows("select * from user where id=$id")
    }

    static List findUserAddressList(String user_id){
        return prod_meiji_user.rows("select * from user_address where user_id = $user_id and is_delete = 0 order by gmt_create limit 1")
    }

    static List order_info(String orderCode){
        return prod_meiji_order.rows("select * from order_info where order_code = $orderCode")
    }

    static List getOrderLogisticsInfo(String orderCode){
        return prod_meiji_order.rows("select * from order_logistic where order_code = $orderCode")
    }

    static  List getUserOrderCount_toAfterCount(String ShopId){
        return prod_meiji_order.rows("select count(*) as AfterCount from order_after where shop_id = $ShopId")
    }

    static List getUserOrderCount_toConfirmCount(String ShopId){
        return prod_meiji_order.rows("select count(*) as confirmCount from order_info where shop_id = $ShopId and order_status = 5")
    }

    static List getUserOrderCount_toDeliveryCount(String ShopId){
        return prod_meiji_order.rows("select count(*) as DeliveryCount from order_info where shop_id = $ShopId and order_status in(2,3,4)")
    }

    static List getUserOrderCount_toPayCount(String ShopId){
        return prod_meiji_order.rows("select count(*) as PayCount from order_info where shop_id = $ShopId and order_status =1")
    }

    static List pageOrder(String shopId){
        return prod_meiji_order.rows("select * from order_info where shop_id = $shopId and order_type <> 4 ORDER BY gmt_create DESC limit 10")
    }

    static  List updateUserAddress(String id){
        return prod_meiji_user.rows("select * from user_address where id = $id")
    }

    static Map getUserInfo(String UserId){
        return prod_meiji_user.firstRow("select * from user where id =$UserId")
    }

    static List getSettleOrder(){
        List list = prod_meiji_settlement.rows("select trade_parent_order_no from settlement_order where settlement_state =2 and gmt_modified > date_sub(now(),interval 1 Day)")
        return list.stream().map() {
            return it.trade_parent_order_no
        }.collect(Collectors.toList())
    }
}

package com.meiji.biz.service


import com.meiji.biz.api.MysqlAPI
import com.miyuan.ifat.support.factory.FactorySupport
import groovy.sql.Sql

import java.util.stream.Collectors

class MysqlService extends MysqlAPI {

    static Map getBrand(String id){
        return meiji_goods.firstRow("select * from goods_brand where id = $id")
    }

    static List getCategoryById(String id){
        return meiji_goods.rows("select * from goods_category where id=$id")
    }

    static List getCategoryByType(String type){
        return meiji_goods.rows("select * from goods_category where type = $type")
    }

    static List prodElectronicContractdetail(String contractId){
        return meiji_supplier.rows("select * from contract where id = $contractId")
    }

    static Map FreightTemplateQueryPage(){
        return meiji_supplier.rows("SELECT * FROM `freight_template` WHERE supplier_id = 77 AND deleted  = 0 ORDER BY id DESC Limit 20").get(0)
    }

    static List prodElectronicContractDownload(Integer contractId){
        return meiji_supplier.rows("select * from contract where id = $contractId")
    }

    static List prodQueryPage(String rows){
        return meiji_supplier.rows("select count(*) as contTotal from contract ")
    }

    static Map invitationCodeListQueryPage(){
        return meiji_shop.rows("select *  from invite_code  order by id desc limit 20").get(2)
    }

    static Map costPerSalesListGetCpsGoods(){
        return meiji_goods.firstRow("select * from meiji_goods.goods_spu WHERE code = '200sup39806'")
    }

    static Map costPerSalesListGetCurrentCategoryGoods(String id){
        return meiji_goods.rows("SELECT * FROM meiji_goods.cps_goods_relationship WHERE cps_category_id = $id").get(0)
    }

    static Map costPerSalesListGetSelectedGoods(){
        return meiji_goods.rows("SELECT * FROM `meiji_goods`.`cps_goods_relationship` WHERE `cps_category_id` = '1441958675349536'").get(1)
    }

    static List addCategory(String type,String sort){
        return meiji_goods.rows("select * from goods_category where type = $type and sort = $sort")
    }

    static List getCategory(String type,String name){
        return meiji_goods.rows("select * from goods_category where type = $type and name = $name")
    }

    static List findShopById(String id){
        return meiji_shop.rows("select * from shop where id = $id")
    }

    static  List findShopBusinessInfo(String shop_id){
        return meiji_shop.rows("select * from shop_business_info where shop_id = $shop_id")
    }

    static List asset(String shop_id){
        return meiji_settlement.rows("select sum(seller_profit_sharing_price) as TotalPrice from settlement_order where settlement_state =0 and shop_id = $shop_id")
    }

    static Map profitSharing(String shop_id,String orderNo){
        return meiji_settlement.firstRow("SELECT * from settlement_order where shop_id =$shop_id and trade_order_no = $orderNo")
    }

    static List findUserInfo(String id){
        return meiji_user.rows("select * from user where id=$id")
    }

    static List findUserAddressList(String user_id){
        return meiji_user.rows("select * from user_address where user_id = $user_id and is_delete = 0 order by gmt_create limit 1")
    }

    static List order_info(String orderCode){
        return meiji_order.rows("select * from order_info where order_code = $orderCode")
    }

    static List getOrderLogisticsInfo(String orderCode){
        return meiji_order.rows("select * from order_logistic where order_code = $orderCode")
    }

    static  List getUserOrderCount_toAfterCount(String ShopId){
        return meiji_order.rows("select count(*) as AfterCount from order_after where shop_id = $ShopId and op_user_type <> 2")
    }

    static List getUserOrderCount_toConfirmCount(String ShopId){
        return meiji_order.rows("select count(*) as confirmCount from order_info where shop_id = $ShopId and order_status = 5 and order_type !=4")
    }

    static List getUserOrderCount_toDeliveryCount(String ShopId){
        return meiji_order.rows("select count(*) as DeliveryCount from order_info where receiver_tel = 19928717417 and order_status in(2,3,4) and order_type <> 4")
    }

    static List getUserOrderCount_toPayCount(String ShopId){
        return meiji_order.rows("select count(*) as PayCount from order_info where shop_id = $ShopId and order_status =1")
    }

    static List pageOrder(String shopId){
        return meiji_order.rows("select * from order_info where shop_id = $shopId and order_type <> 4 ORDER BY gmt_create DESC limit 10")
    }

    static  List updateUserAddress(String id){
        return meiji_user.rows("select * from user_address where id = $id")
    }

    static Map getUserInfo(String UserId){
        return meiji_user.firstRow("select * from user where id =$UserId")
    }

    static List<Map> getUnSettleOrder(){
        return meiji_settlement.rows("select shop_name,trade_parent_order_no from settlement_order where settlement_state !=2 and gmt_create < date_sub(now(),interval 7 Day) order by gmt_create desc")
    }

    static List<Map> getOrderByParentOrderNo(String parentOrderNo){
        return meiji_settlement.rows("select trade_order_no,gmt_create,state,settlement_state from settlement_order where trade_parent_order_no = $parentOrderNo")
    }

    static List getOrderLogistic(String orderNo){
        return meiji_order.rows("select logistics_code,gmt_create,logistics_company_code from order_logistic where order_code = $orderNo")
    }

    static List getAfterOrder(String orderId){
        return meiji_order.rows("select after_status,gmt_create from order_after where order_code = $orderId")
    }

    static List getShops(){
        List list = meiji_shop.rows("select id,shop_name from shop where auth_state = 40 and audit_state = 20 and state = 1 order by gmt_create desc limit 50")
        return list
    }

    static Integer getInviteCodeNum(Long shopId){
        Map map = meiji_shop.firstRow("select  count(*) as cnt from invite_code where shop_id = $shopId")
        return map.cnt
    }

    static List getOrderInfoStatus(){
        return meiji_order.rows("SELECT order_code, parent_order_code,order_status, order_type,gmt_create from order_info where pay_status !=0 and order_type !=3 and gmt_create> DATE_SUB(NOW(),INTERVAL 1 DAY)")
    }

    static Map getSettlementOrderStatusByOrderNo(String orderNo){
        return meiji_settlement.firstRow("SELECT trade_order_no, trade_parent_order_no,state,gmt_create from settlement_order where trade_order_no = $orderNo ")
    }

    static  Map getGoods_brand(){
        return meiji_goods.firstRow("SELECT * from goods_brand ORDER BY gmt_create DESC LIMIT 20")
    }

    static Map getOrderByPage(){
        return meiji_order.rows("SELECT * from order_info ORDER BY gmt_create DESC limit 20")
    }

    static Map batchUpdateConfig(){
        return meiji_goods.firstRow("SELECT * from meiji_system.config_log where `key` like 'lockingPeriod' ORDER BY update_time desc;")
    }

    static  Map findShopByUserId(){
        return meiji_shop.firstRow("SELECT * from shop where id=1405981112139808")
    }

    static Map flowPageQuery(){
        return meiji_pay.firstRow("SELECT * from trade_flow where merchant_type =1 and entity_id = 1405981112139808 and `year` = 2021 and `month` =7 and trade_type = 4")
    }

    static List findInviteCodeList(String shopId){
        return meiji_shop.rows("SELECT * from invite_code where shop_id = $shopId AND state = 0 ORDER BY id ASC LIMIT 20")
    }

    static Map getChannel(){
        return meiji_goods.firstRow("SELECT * from channel ORDER BY gmt_create DESC")
    }
}

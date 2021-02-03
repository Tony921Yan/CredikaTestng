package com.miyuan.util
import com.miyuan.factory.FactorySupport
import groovy.sql.Sql


class SetUtil {
    static Integer Mod256 (Integer userId){
        Integer userid=userId
        Integer mod256=userid%256
        return  mod256
    }
    static Integer Mod64 (Integer userId){
        Integer userid=userId
        Integer  mod64=userid%64
        return  mod64
    }
    static Integer Mod32 (Integer userId){
        Integer userid=userId
        Integer  mod32=userid%32
        return  mod32
    }
    static Integer  Mod4 (Integer userId){
        Integer userid=userId
        Integer  mod4=userid%4
        return  mod4
    }
}

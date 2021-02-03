package com.miyuan.com

import com.alibaba.fastjson.JSON


class TestContext extends HashMap{
    public String getToken(){
        return super.get("token")
    }

    public Map getResponse(){
        return (Map)JSON.parse(super.get("response").toString())
    }

    public Map getRequest(){
        return (Map)JSON.parse(super.get("request").toString())
    }

    public void appendLog(Object log){
        List list = new ArrayList<>()
        def last = super.get("log")
        if(last){
            list.addAll(last as List)
        }
        list.add(log)
        super.put("log",list)
    }

    @Override
    String toString() {
        return get("description")
    }
}

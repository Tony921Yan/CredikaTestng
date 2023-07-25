package com.miyuan.ifat.support.test

import com.alibaba.fastjson.JSON
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.vo.Record
import com.miyuan.ifat.support.vo.Result


class TestContext extends HashMap {
    public String getToken() {
        return get("token")
    }

    public void setUser(String userId){
        put("userId", userId)
    }

    public Object getResponse() {
        def res = super.get("response")
        if(res==null){
            Result result = super.get("result")
            res = result.getResp()
        }
        return JsonUtil.objectParse(res)
    }

    public Object getResult() {
        return super.get("result")
    }

    public Object getRequest() {
        return super.get("request")
    }

    public void setResponse(Object response) {
        put("response", response)
    }

    public void setResult(Object result) {
        put("result", result)
    }

    public void setRequest(Object request) {
        put("request", request)
    }

    public void appendLog(Record record) {
        List list = new ArrayList<>()
        def last = get("record")
        if (last) {
            list.addAll(last as List)
        }
        list.add(record)
        super.put("record", list)
    }

    @Override
    String toString() {
        return get("description")
    }
}

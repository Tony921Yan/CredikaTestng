package com.meiji.vo

class ResultRpcVO {
    public String code

    public String msg

    public String trace

    public Object data

    public Long timestamp

    public ResultRpcVO() {

    }

    public ResultRpcVO(String msg, Object data, String code) {
        this.msg = msg
        this.data =  data
        this.code = code
    }
}

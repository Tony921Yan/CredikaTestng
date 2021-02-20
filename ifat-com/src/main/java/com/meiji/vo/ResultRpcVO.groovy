package com.meiji.vo

class ResultRpcVO {
    private String code

    private String msg

    private String trace

    private Object data

    private Long timestamp

    public ResultRpcVO() {

    }

    public ResultRpcVO(String msg, Object data, String code) {
        this.msg = msg
        this.data =  data
        this.code = code
    }
}

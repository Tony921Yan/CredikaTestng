package com.miyuan.ifat.support.vo

class Result {
    Object httpStatusCode
    List httpHeaders
    Object resp
    String errorMessage


    @Override
    public String toString() {
        return "{" +
                "httpStatusCode=" + httpStatusCode +
                ", httpHeaders=" + httpHeaders +
                ", resp=" + resp +
                ", errorMessage='" + errorMessage + '\'' +
                '}'
    }
}

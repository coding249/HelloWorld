package com.examples.demo.entity;

public class CheckCode {
    private int code;
    private String msg;
    private Object result;
    private String captchalmg;
    private String ticket;


    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public void setCaptchalmg(String captchalmg) {
        this.captchalmg = captchalmg;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getCode() {
        return code;
    }

    public String getMsg(){
        return msg;
    }

    public Object getResult(){
        return result;
    }

    public String getCaptchalmg(){
        return captchalmg;
    }

    public String getTicket(){
        return ticket;
    }
}

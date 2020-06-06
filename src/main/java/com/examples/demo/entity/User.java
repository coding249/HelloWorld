package com.examples.demo.entity;


/**
 * Created by coding249 on 2020-5-20 返回Json数据实体类
 */

public class User {
    private int id;
    private String username;
    private String password;
    private String datestr;

    public String getDatestr(){
        return datestr;
    }

    public void setDatestr(String datestr){
        this.datestr = datestr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

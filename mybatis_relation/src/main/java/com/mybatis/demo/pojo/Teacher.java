package com.mybatis.demo.pojo;

public class Teacher {

    private int t_id; //int(11) NOT NULL教师编号

    private String t_name; //varchar(30) NOT NULL教师名称

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}

package com.mybatis.demo.pojo;

public class Student {

    private int s_id; //int(11) NOT NULL学生编号
    private String s_name; //varchar(30) NOT NULL学生名称
    private int c_id; //int(11) NOT NULL班级编号

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }
}

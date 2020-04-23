package com.example.demo.pojo;

/**
 *  对应数据库u_user表的实体类
 */
public class User {
    private int id;       //用户编号
    private String name;  //用户名称
    private String sex;   //用户性别
    private int age;      //用户年龄

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

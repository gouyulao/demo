package com.mybatis.demo.pojo;

import java.util.List;

public class Classes {

    private int id; //int(11) NOT NULL班级编号
    private String name; //varchar(30) NOT NULL班级名称
    private int t_id; //int(11) NOT NULL教师编号

    //一对一
    private Teacher teacher;

    //一对多
    private List<Student> studentList;

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

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}

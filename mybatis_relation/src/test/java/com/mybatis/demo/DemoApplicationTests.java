package com.mybatis.demo;

import com.mybatis.demo.mapper.ClassesMapper;
import com.mybatis.demo.pojo.Classes;
import com.mybatis.demo.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Resource
	private ClassesMapper classesMapper;

	/**
	 * 一对一查询测试
	 */
	@Test
	public void test01() {
		Classes classes=classesMapper.getClasses(1);
		System.out.println("班级编号:"+classes.getId()+",班级名称:"+classes.getName()+",教师编号:"+classes.getTeacher().getT_id()+",教师名称:"+classes.getTeacher().getT_name());
	}

	/**
	 * 一对多查询测试
	 */
	@Test
	public void test02() {
		Classes classes=classesMapper.listClasses(1);

		System.out.println("班级编号:"+classes.getId()+",班级名称:"+classes.getName()+",教师编号:"+classes.getTeacher().getT_id()+",教师名称:"+classes.getTeacher().getT_name());

		for (Student item : classes.getStudentList()){
			System.out.println("学生编号:"+item.getS_id()+",学生姓名:"+item.getS_name());
		}
	}

}

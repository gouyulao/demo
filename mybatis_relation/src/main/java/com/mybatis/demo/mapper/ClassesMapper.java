package com.mybatis.demo.mapper;

import com.mybatis.demo.pojo.Classes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassesMapper {

    /**
     * 根据班级编号一对一查询
     */
    Classes getClasses(int c_id);

    /**
     * 根据班级编号一对多
     * @return
     */
    Classes listClasses(int c_id);
}

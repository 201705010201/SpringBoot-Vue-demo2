package com.xm.mapper;

import java.util.List;

import com.xm.pojo.Student;
import java.util.Map;

public interface StudentMapper {

	/**
	 * 根据id查询
	 * @param sno
	 * @return
	 */
	public Student getById(String sno) ;
	
	/**
	 * 查询全部
	 * @return
	 */
	public List<Student> list();
	
	/**
	 * 查询成绩
	 * @return
	 */
	public List<Map>  grade();
        
	/**
	 * 插入
	 * @param student
         * @return 
	 */
	public int insert(Student student);

	/**
	 * 根据student的id修改
	 * @param student
         * @return 
	 */
	public int update(Student student);
	
	/**
	 * 根据id删除
         * @return 
	 * @param sno
	 */
	public int delete(String sno);
	
	
}

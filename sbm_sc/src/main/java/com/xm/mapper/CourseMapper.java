package com.xm.mapper;

import com.xm.pojo.Course;
import com.xm.pojo.Student;

import java.util.List;
import java.util.Map;

public interface CourseMapper {

	/**
	 * 根据id查询
	 * @param cno
	 * @return
	 */
	public Course getById(String cno) ;
	
	/**
	 * 查询全部
	 * @return
	 */
	public List<Course> list();
	
	/**
	 * 查询成绩
	 * @return
	 */
//	public List<Map>  grade();
        
	/**
	 * 插入
	 * @param course
         * @return 
	 */
	public int insert(Course course);

	/**
	 * 根据course的id修改
	 * @param course
         * @return 
	 */
	public int update(Course course);
	
	/**
	 * 根据id删除
         * @return 
	 * @param cno
	 */
	public int delete(String cno);
	
	
}

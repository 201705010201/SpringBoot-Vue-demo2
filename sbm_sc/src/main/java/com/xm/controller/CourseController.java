package com.xm.controller;

import com.xm.mapper.CourseMapper;
import com.xm.pojo.Course;
import com.xm.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin//允许跨域访问
@RestController
public class CourseController {
	@Autowired
	private CourseMapper courseMapper;
	
	/**
	 * 根据id查询课程
	 * @param cno
	 * @return
	 */
	@GetMapping("/course/{cno}")
	public Course getById(@PathVariable("cno") String cno) {
		Course course = courseMapper.getById(cno);
            return course;
	}
	
	/**
	 * 查询全部课程
	 * @return
	 */
	@GetMapping("/courses")
	public List<Course> list(){
            List<Course> Courses = courseMapper.list();
            return Courses;
	}
	
	/**
	 * 查询学生成绩
	 * @return
	 */
//	@GetMapping("/grades")
//	public List<Map> gradelist(){
//            List<Map> grademap = courseMapper.grade();
//            return grademap;
//	}
        
        /**
	 * 插入
	 * @param course
         * @return
	 */
	@PostMapping("/course")
	public String insert(@RequestBody Course course) {
            int rows=courseMapper.insert(course);
            return "{\"rows\":\""+rows+"\"}" ;
	}
	
	/**
	 * 修改
	 * @param course
         * @return
	 */
	@PutMapping("/course")
	public String update(@RequestBody Course course) {
            int rows=courseMapper.update(course);
            return "{\"rows\":\""+rows+"\"}" ;
	}
	
	/**
	 * 根据id删除
	 * @param cno
         * @return
	 */
	@DeleteMapping("/course/{cno}")
	public String delete(@PathVariable("cno") String cno) {
            int rows=courseMapper.delete(cno);
            return "{\"rows\":\""+rows+"\"}" ;
	}

}

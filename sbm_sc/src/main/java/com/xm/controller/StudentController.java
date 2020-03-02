package com.xm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import com.xm.mapper.StudentMapper;
import com.xm.pojo.Student;
import java.util.Map;

@CrossOrigin//允许跨域访问
@RestController
public class StudentController {
	@Autowired
	private StudentMapper studentMapper;
	
	/**
	 * 根据id查询学生
	 * @param sno
	 * @return
	 */
	@GetMapping("/student/{sno}")
	public Student getById(@PathVariable("sno") String sno) {
            Student student = studentMapper.getById(sno);
            return student;
	}
	
	/**
	 * 查询全部学生
	 * @return
	 */
	@GetMapping("/students")
	public List<Student> list(){
            List<Student> students = studentMapper.list();
            return students; 
	}
	
	/**
	 * 查询学生成绩
	 * @return
	 */
	@GetMapping("/grades")
	public List<Map> gradelist(){
            List<Map> grademap = studentMapper.grade();
            return grademap; 
	}
        
        /**
	 * 插入
	 * @param student
         * @return
	 */
	@PostMapping("/student")
	public String insert(@RequestBody Student student) {
            int rows=studentMapper.insert(student);
            return "{\"rows\":\""+rows+"\"}" ;
	}
	
	/**
	 * 修改
	 * @param student
         * @return
	 */
	@PutMapping("/student")
	public String update(@RequestBody Student student) {
            int rows=studentMapper.update(student);
            return "{\"rows\":\""+rows+"\"}" ;
	}
	
	/**
	 * 根据id删除
	 * @param sno
         * @return
	 */
	@DeleteMapping("/student/{sno}")
	public String delete(@PathVariable("sno") String sno) {
            int rows=studentMapper.delete(sno);
            return "{\"rows\":\""+rows+"\"}" ;
	}

}

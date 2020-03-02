package com.xm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xm.mapper.StudentMapper;
import com.xm.pojo.Student;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
	@Autowired
	private StudentMapper studentMapper;
	
	@Test
	public void select() {
            List<Student> students=studentMapper.list();
            System.out.println(students.toString());
        }

    @Test
	public void insert() {
            Student student = new Student();
            student.setSno("0012");
            student.setSname("佩奇");
            student.setSsex("男");
            student.setSage(2);
            student.setSdept("信工");

            int a=studentMapper.insert(student);
            System.out.println(a);
            System.out.println(student.getSno());
	}
        
	@Test
	public void update() {
            Student student = new Student();
            student.setSno("0012");
            student.setSname("小猪佩奇");
            student.setSsex("男");
            student.setSage(4);
            student.setSdept("会计");

            int a=studentMapper.update(student);
            System.out.println(a);
            System.out.println(student.getSno());
	}
        
        @Test
	public void delete() {
            int a=studentMapper.delete("0012");
            System.out.println(a);
		
	}	

}

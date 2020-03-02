package com.xm;

import com.xm.mapper.CourseMapper;
import com.xm.pojo.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseTest {
	@Autowired
	private CourseMapper courseMapper;
	
	@Test
	public void select() {
            List<Course> courses=courseMapper.list();
            System.out.println(courses.toString());
        }

    @Test
	public void insert() {
            Course course = new Course();
            course.setCno("007");
            course.setCname("云计算");
            course.setCpno("1");
            course.setCcredit(2);
            int c=courseMapper.insert(course);
            System.out.println(c);
            System.out.println(course.getCno());
	}
        
	@Test
	public void update() {
            Course course = new Course();
            course.setCno("007007");
            course.setCname("云计算yunjisuan");
            course.setCpno("1");
            course.setCcredit(2);

            int a=courseMapper.update(course);
            System.out.println(a);
            System.out.println(course.getCno());
	}
        
        @Test
	public void delete() {
            int a=courseMapper.delete("007");
            System.out.println(a);
		
	}	

}

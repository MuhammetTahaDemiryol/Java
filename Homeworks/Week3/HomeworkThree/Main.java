package Homeworks.Week3.HomeworkThree;

import java.util.ArrayList;
import java.util.List;

import Homeworks.Week3.HomeworkThree.business.*;
import Homeworks.Week3.HomeworkThree.dataAccess.category.*;
import Homeworks.Week3.HomeworkThree.dataAccess.course.*;
import Homeworks.Week3.HomeworkThree.dataAccess.instructor.*;
import Homeworks.Week3.HomeworkThree.entity.*;
import Homeworks.Week3.HomeworkThree.logger.*;

public class Main {
    public static void main(String[] args) throws Exception {

        List<ILogger> loggers = new ArrayList<>();

        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new EmailLogger());


        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        
        Category category1 = new Category(1, "Software");
        Category category2 = new Category(2, "R&D");
        Category category3 = new Category(3, "Engineering");

        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);

        for (Category category : categoryManager.getCategories()) {
            System.out.println(category.getName());
        }
       
        categoryManager.delete(category1.getId());
        categoryManager.update(0, category2);


        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);

        Instructor instructor1 = new Instructor(1, "Ahmet Temiz", 5);
        Instructor instructor2 = new Instructor(2, "Berk Terk", 3);

        instructorManager.add(instructor1);
        instructorManager.add(instructor2);

        for (Instructor instructor : instructorManager.getInstructors()) {
            System.out.println(instructor.getName());
        }

        instructorManager.delete(instructor2.getId());
        instructorManager.update(0, instructor2);


        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);

        Course course1 = new Course(1, "Css", 65);
        Course course2 = new Course(2, "Java", 56);
        Course course3 = new Course(3, "C++", 23);
        Course course4 = new Course(4, "C#", 10);

        courseManager.add(course2);
        courseManager.add(course4);
        courseManager.add(course1);
        courseManager.add(course3);

        for (Course course : courseManager.getCourses()) {
            System.out.println(course.getName());
        }

        courseManager.delete(course1.getId());
        courseManager.update(2,course3);
       
    }
}

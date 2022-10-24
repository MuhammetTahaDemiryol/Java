package Homeworks.Week3.HomeworkThree.dataAccess.course;

import java.util.ArrayList;
import java.util.List;

import Homeworks.Week3.HomeworkThree.entity.Course;

public class JdbcCourseDao implements ICourseDao {

    private List<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        courses.add(course);
        System.out.println("Course added with : Jdbc.");
    }

    @Override
    public void delete(int id) {
        courses.remove(id);
        System.out.println("Course deleted.");
    }

    @Override
    public void update(int id, Course course) {
        courses.set(id, course);
        System.out.println("Course updated.");
    }

    @Override
    public Course findById(int id) {
        return courses.get(id);
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }
}

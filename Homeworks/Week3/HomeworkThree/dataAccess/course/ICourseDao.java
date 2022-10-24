package Homeworks.Week3.HomeworkThree.dataAccess.course;

import java.util.List;

import Homeworks.Week3.HomeworkThree.entity.Course;

public interface ICourseDao {
    void add(Course course);

    void delete(int id);

    void update(int id, Course course);

    Course findById(int id);

    List<Course> getCourses();
}

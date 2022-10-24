package Homeworks.Week3.HomeworkThree.business;

import java.util.ArrayList;
import java.util.List;

import Homeworks.Week3.HomeworkThree.dataAccess.course.ICourseDao;
import Homeworks.Week3.HomeworkThree.entity.Course;
import Homeworks.Week3.HomeworkThree.logger.ILogger;

public class CourseManager {

    private ICourseDao courseDao;
    private List<ILogger> loggers = new ArrayList<>();

    public CourseManager(ICourseDao courseDao, List<ILogger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {

        boolean isRepeat = false;

        for (Course c : courseDao.getCourses()) {
            if (course.getName().equals(c.getName())) {
                isRepeat = true;
            }
        }
        if (course.getPrice() < 0) {
            throw new Exception("The price can not be lower than 0.");
        } else {

            if (!isRepeat) {
                courseDao.add(course);
            } else {
                throw new Exception("Course name can not repeat.");
            }
        }

        for (ILogger logger : loggers) {
            logger.log(course.getName());
        }

    }

    public void delete(int id) {
        courseDao.delete(id);
    }

    public void update(int id, Course course) {
        courseDao.update(id, course);
    }
    
    public Course findById(int id) {
        return courseDao.findById(id);
    }

    public List<Course> getCourses() {
        return courseDao.getCourses();
    }

}

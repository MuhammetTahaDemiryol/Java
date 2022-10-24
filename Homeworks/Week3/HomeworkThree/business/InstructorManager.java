package Homeworks.Week3.HomeworkThree.business;

import java.util.ArrayList;
import java.util.List;

import Homeworks.Week3.HomeworkThree.dataAccess.instructor.IInstructorDao;
import Homeworks.Week3.HomeworkThree.entity.Instructor;
import Homeworks.Week3.HomeworkThree.logger.ILogger;

public class InstructorManager {

    private IInstructorDao instructorDao;
    private List<ILogger> loggers = new ArrayList<>();

    public InstructorManager(IInstructorDao instructorDao, List<ILogger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);

        for (ILogger logger : loggers) {
            logger.log(instructor.getName());
        }
    }

    public void delete(int id) {
        instructorDao.delete(id);
    }

    public void update(int id, Instructor instructor) {
        instructorDao.update(id, instructor);
    }
    
    public Instructor findById(int id) {
        return instructorDao.findById(id);
    }

    public List<Instructor> getInstructors() {
        return instructorDao.getInstructors();
    }

}

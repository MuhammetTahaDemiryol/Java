package Homeworks.Week3.HomeworkThree.dataAccess.instructor;

import java.util.List;

import Homeworks.Week3.HomeworkThree.entity.Instructor;

public interface IInstructorDao {
    void add(Instructor instructor);

    void delete(int id);

    void update(int id, Instructor instructor);

    Instructor findById(int id);

    List<Instructor> getInstructors();
}

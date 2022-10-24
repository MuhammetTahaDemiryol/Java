package Homeworks.Week3.HomeworkThree.dataAccess.instructor;

import java.util.ArrayList;
import java.util.List;

import Homeworks.Week3.HomeworkThree.entity.Instructor;

public class HibernateInstructorDao implements IInstructorDao{
    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public void add(Instructor instructor) {
        instructors.add(instructor);
        System.out.println("Instructor added with : Hibernate.");

    }

    @Override
    public void delete(int id) {
        instructors.remove(id-1);
        System.out.println("Instructor deleted.");
    }

    @Override
    public void update(int id, Instructor instructor) {
        instructors.set(id, instructor);
        System.out.println("Instructor updated.");
    }

    @Override
    public Instructor findById(int id) {

        return instructors.get(id);
    }

    @Override
    public List<Instructor> getInstructors() {
        return instructors;
    }
}

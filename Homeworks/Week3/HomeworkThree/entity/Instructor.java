package Homeworks.Week3.HomeworkThree.entity;

public class Instructor {
    private int id;
    private String name;
    private int numberOfCourse;

    public Instructor() {

    }

    public Instructor(int id, String name, int numberOfCourse) {
        this.id = id;
        this.name = name;
        this.numberOfCourse = numberOfCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }
}

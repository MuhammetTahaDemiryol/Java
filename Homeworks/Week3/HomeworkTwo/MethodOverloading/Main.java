package Homeworks.Week3.HomeworkTwo.MethodOverloading;

public class Main {

    public static void main(String[] args) {

        FourOperations fourOperations = new FourOperations();

        System.out.println(fourOperations.add(2, 3));
        System.out.println(fourOperations.add(2, 3, 5));

    }

}

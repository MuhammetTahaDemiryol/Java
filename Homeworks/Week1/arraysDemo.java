package Homeworks.Week1;

public class arraysDemo {
    public static void main(String[] Args) {

        String student1 = "Engin";
        String student2 = "Derin";
        String student3 = "Salih";
        String student4 = "Ahmet";

        System.out.println("student1 :" + student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("---------------------");


        String[] students = new String[4];

        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";
        students[3] = "Ahmet";
        // students[4] = "Ali"

       for (int i = 0; i < students.length; i++) {

            System.out.println(students[i]);

        }

        System.out.println("---------------------");

        for (String student : students) {

            System.out.println(student);

        }
    }
}
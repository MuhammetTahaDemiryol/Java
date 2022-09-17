package Homeworks.Week1;

public class switchDemo {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Best");
                break;
            case 'B':
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Passable");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Unable to interpret");

        }
    }
}

package Homeworks.Week1;

public class loopDemo {

   
    public static void main(String[] Args) {

        // For Loop
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);

        }
        System.out.println("For Loop Over");

        // While Loop
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("While Loop Over");

        // Do-While Loop
        int j = 100;
        do {
            System.out.println(j);
            j++;
        } 
        while (j < 105);
        System.out.println("Do-While Loop Over");

    }

}

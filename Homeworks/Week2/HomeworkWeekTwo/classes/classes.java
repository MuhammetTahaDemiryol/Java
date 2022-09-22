package HomeworkWeekTwo.classes;

public class classes {

    public static void main(String[] args) {
        
        customerManager customerManager = new customerManager();
        customerManager customerManager2 = new customerManager();
        customerManager = customerManager2;
        customerManager2.add("Bob");
        customerManager2.remove("Bob");
        customerManager.update("Bob");

        //Value
        int n = 10;
        int n2 = 20;
        n2 = n;
        n = 30;
        System.out.println(n2); // 10 

        //Reference
        int[] numbers = new int[] {1,2,3};
        int[] numbers2 = new int[] {4,5,6};
        numbers2 = numbers;
        numbers[0] = 10;
        System.out.println(numbers2[0]); //10


    }
}

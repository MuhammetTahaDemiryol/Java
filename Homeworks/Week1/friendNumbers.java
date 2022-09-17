package Homeworks.Week1;

public class friendNumbers {
    
    public static void main(String[] args) {
        int n1 = 220;
        int n2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0) {
                total2 = total2 + i;
            }
        }

        /*if (n1 == total2) {
            if (n2 == total1) {
            }
        }*/
        
        
        if (n1 == total2 && n2==total1) {
            System.out.println("Friends");
        }
        else{
            System.out.println("Not Friends");

        }
    }

}

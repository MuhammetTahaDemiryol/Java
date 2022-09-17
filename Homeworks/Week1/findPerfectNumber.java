package Homeworks.Week1;

public class findPerfectNumber {

public static void main(String[] args) {

    int number = 28;
    int total = 0;

    if(number<0){
        System.out.println("Invalid Number");
        return;
    }

    for (int i = 1; i < number; i++) {
        if (number % i == 0) {
            total = total + i;
        }
    }

    if (total == number) {
        System.out.println("Perfect");
    } 
    else {
        System.out.println("Not Perfect");
    }

}


}
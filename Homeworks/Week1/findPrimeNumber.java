package Homeworks.Week1;

public class findPrimeNumber {

    public static void main(String[] args) {
        
        int number = -919;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println(number + " Is Not Prime");
            return;

        }
        if(number<1) {

            System.out.println(number + " Is Invalid Number");
            return;

        }

        for(int i = 2; i<number;i++) {

            if (number % i == 0) {
            isPrime = false;
        }
    }
        if(isPrime)

    {
        System.out.println(number + " Is Prime Number");
    } else

    {
        System.out.println(number + " Is Not Prime");
    }

}








}
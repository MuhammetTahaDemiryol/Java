package Homeworks.Week3.HomeworkOne;

import java.io.*;

public class Program {
    
    
    public static void main(String[] args) {
        
        //Stack and heap memory examples
        
        //Exapmle1
        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;
        System.out.println(number1);

        //Example2
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {10, 20, 30};
        numbers1 = numbers2;
        numbers2[0] = 1000;
        System.out.println(numbers1[0]);

        // Reading from console example
        Console cnsl = System.console(); 
        if (cnsl == null) { 
            System.out.println("No console available"); 
            return; 
        }
        // Read line 
        String str = cnsl.readLine("Enter string: ");
        // Print 
        System.out.println("Entered String: " + str); 

    }


}



     
  

    
        
    

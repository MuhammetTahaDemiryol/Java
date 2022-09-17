package Homeworks.Week1;

public class findNumber {
    
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,5,7,9,0};
        int target = 11;
        boolean exists = false;

        for (int number : numbers){
           
            if(target == number){
                exists = true;
                break;
            }

        }
    
        if(exists){
            System.out.println("Inside Array");
        }
        else{
            System.out.println("Not inside Array");
        }
    
    
    
    
    
    

        



    }

}

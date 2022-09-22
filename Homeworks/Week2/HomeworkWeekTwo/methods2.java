package HomeworkWeekTwo;

public class methods2 {

    public static void main(String[] args) {

        String newMessage = giveCity() ;
        System.out.println(newMessage);
        int number = summation(5,7);
        System.out.println(number);
        System.out.println(summationTwo(1,2,3,4,5));
    }

    public static void add(){
        System.out.println("Added");
    }

    public static void delete(){
        System.out.println("Deleted");
    }

    public static void update(){
        System.out.println("Uptaded");
    }

    public static String giveCity(){
        return "New York";
    }

    public static int summation(int numberOne, int numberTwo){
        return numberOne+numberTwo;
    }

    public static int summationTwo(int... numbers){
        int total=0;
        for (int number : numbers){
            total += number;
        }
        return total;
    }
    
}

package Homeworks.Week3.HomeworkTwo.PolymorphismDemo;

public class EmailLogger extends BaseLogger {
    
    public void log(String message) {
        
        System.out.println("Logged to email: " + message);

    }
}

package Homeworks.Week3.HomeworkTwo.PolymorphismDemo;

public class FileLogger extends BaseLogger {
    
    public void log(String message) {
        
        System.out.println("Logged to file: " + message);

    }
}

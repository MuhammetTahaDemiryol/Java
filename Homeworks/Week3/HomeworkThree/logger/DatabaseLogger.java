package Homeworks.Week3.HomeworkThree.logger;

public class DatabaseLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Logged to database : " + data);
    }
}

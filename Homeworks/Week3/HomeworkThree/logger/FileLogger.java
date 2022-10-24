package Homeworks.Week3.HomeworkThree.logger;

public class FileLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Logged to file : " + data);
    }
}

package Homeworks.Week3.HomeworkThree.logger;

public class EmailLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Logged with Email : " + data);
    }
}

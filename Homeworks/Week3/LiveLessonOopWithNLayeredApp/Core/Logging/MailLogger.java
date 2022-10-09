package Homeworks.Week3.LiveLessonOopWithNLayeredApp.Core.Logging;

public class MailLogger implements Logger {
    
    @Override
    public void log(String data) {
        System.out.println("Logged via mail:" + data);
        
    }
}

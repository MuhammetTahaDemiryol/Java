package Homeworks.Week3.LiveLessonOopWithNLayeredApp.Core.Logging;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Logged into the database: " + data);
        
    }
    
}

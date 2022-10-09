package Homeworks.Week3.LiveLessonOopWithNLayeredApp.Core.Logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Logged into the file: " + data);
        
    }
    
}

package Homeworks.Week3.HomeworkTwo.PolymorphismDemo;

public class Main {
    
    public static void main(String[] args) {
        
        /* BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};

        for(BaseLogger logger: loggers){
            logger.Log("Message");
        } */

        CustomerManager customerManager = new CustomerManager(new FileLogger());

        customerManager.add();
    }

}

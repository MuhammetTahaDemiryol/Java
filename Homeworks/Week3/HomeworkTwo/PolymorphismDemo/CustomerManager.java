package Homeworks.Week3.HomeworkTwo.PolymorphismDemo;

public class CustomerManager {
    private BaseLogger logger; 

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }


    public void add() {

        

        

        System.out.println("Customer Added");
        this.logger.log("Logged");
        /*
         * DatabaseLogger logger = new DatabaseLogger();
         * logger.Log("Logged");
         */
    }
}

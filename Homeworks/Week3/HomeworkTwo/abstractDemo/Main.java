package Homeworks.Week3.HomeworkTwo.abstractDemo;

public class Main {

    public static void main(String[] args) {
        
        CustomerManager customerManager = new CustomerManager();
        
        // This is what makes the program independent
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

    }

}

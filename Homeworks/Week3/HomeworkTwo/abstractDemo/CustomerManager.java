package Homeworks.Week3.HomeworkTwo.abstractDemo;

public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers() {

        databaseManager.getData();

        /* Wrong use 
        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData(); */

    }

}

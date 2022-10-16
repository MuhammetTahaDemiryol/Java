package Homeworks.Week3.HomeworkTwo.interfaces;

public class Main {
    
    public static void main(String[] args) {
        
       /*  ICustomerDal customerDal = new OracleCustomerDal();

        customerDal.Add(); */

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        
        customerManager.Add();
        
    }
}

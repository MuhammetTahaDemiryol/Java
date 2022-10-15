package Homeworks.Week3.HomeworkTwo.Inheritance;

public class Main {
    
    public static void main() {
        //Customer customer = new Customer();
        //Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.BestEOM();
        customerManager.List();
    }
}

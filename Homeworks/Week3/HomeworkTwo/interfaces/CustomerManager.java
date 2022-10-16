package Homeworks.Week3.HomeworkTwo.interfaces;

public class CustomerManager {
    
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void Add() {
        
        // Work algorithms
        customerDal.Add();

    }
}

package Homeworks.Week3.HomeworkTwo.interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

    @Override
    public void Add() {
        System.out.println("Added to My Sql");
        
    }
    
}

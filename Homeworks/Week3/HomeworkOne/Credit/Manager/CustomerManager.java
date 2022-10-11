package Homeworks.Week3.HomeworkOne.Credit.Manager;

import Homeworks.Week3.HomeworkOne.Credit.Customer.Customer;
import Homeworks.Week3.HomeworkOne.Credit.InterfaceCreditManager;

public class CustomerManager {
    
    
    private Customer _customer;
	private InterfaceCreditManager _creditManager;
	
	public CustomerManager(Customer customer, InterfaceCreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Customer Saved: ");
	}
	
	public void delete() {
		System.out.println("Customer Deleted: ");
	}
	
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Credit approved to customer: " + _customer.getId());
	}

}

package Homeworks.Week3.HomeworkOne.Credit;

import Homeworks.Week3.HomeworkOne.Credit.Manager.CustomerManager;
import Homeworks.Week3.HomeworkOne.Credit.Manager.MilitaryCreditManager;
import Homeworks.Week3.HomeworkOne.Credit.Customer.Customer;


public class Main {
  
	public static void main(String[] args) {
		
		
        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());

		customerManager.giveCredit();

	}

}


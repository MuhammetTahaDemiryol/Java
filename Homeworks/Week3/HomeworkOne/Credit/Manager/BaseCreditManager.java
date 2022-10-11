package Homeworks.Week3.HomeworkOne.Credit.Manager;

import Homeworks.Week3.HomeworkOne.Credit.InterfaceCreditManager;

public abstract class BaseCreditManager implements InterfaceCreditManager {
    
    public abstract void calculate();

	public void save() {

		System.out.println("Saved");
		
	}

}

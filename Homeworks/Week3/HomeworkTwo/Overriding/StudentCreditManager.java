package Homeworks.Week3.HomeworkTwo.Overriding;

public class StudentCreditManager  extends BaseCreditManager{
    
    public double calculate(double expense) {
		System.out.println("Student Credit: " );
		return expense * 1.10;
	}

}

package Homeworks.Week3.HomeworkTwo.Overriding;

public class TeacherCreditManager extends BaseCreditManager{
    
    public double calculate(double expense) {
		System.out.println("Teacher Credit: ");
		return expense * 1.18;
	}
    
}

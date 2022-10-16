package Homeworks.Week3.HomeworkTwo.Overriding;

public class AgricultureCreditManager extends BaseCreditManager {

    public double calculate(double expense) {
        System.out.println("Agriculture Credit: ");
        return expense * 1.10;
    }

}

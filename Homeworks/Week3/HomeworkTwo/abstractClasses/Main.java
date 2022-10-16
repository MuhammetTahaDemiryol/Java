package Homeworks.Week3.HomeworkTwo.abstractClasses;

public class Main {
    
    public static void main(String[] args) {
        
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.Calculate();
        womanGameCalculator.GameOver();

        GameCalculator gameCalculator = new ManGameCalculator();

        gameCalculator.GameOver();
    }
}

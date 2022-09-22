package HomeworkWeekTwo.recapDemoClasses;

public class basicOperations {

    public int summation(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public int extraction(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total -= number;
        }
        return total;
    }

    public int multiplication(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total *= number;
        }
        return total;
    }

    public int division(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }
    
}

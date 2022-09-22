package HomeworkWeekTwo;

public class methods {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = { 1, 4, 2, 7, 3, 9 };
        int target = 5;
        boolean isThere = false;

        for (int number : numbers) {

            if (number == target) {
                isThere = true;
            }
        }

        if (isThere) {
            sendMessage("The target value found: " + target);
        } else {
            sendMessage("The target value not found: " + target);
        }
    }

    public static void sendMessage(String message) {
        System.out.println(message);
    }
}

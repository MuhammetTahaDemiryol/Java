package HomeworkWeekTwo.classes;

public class customerManager {
    public void add(String customerName) {
        System.out.println(customerName + " is added to customer database.");
    }

    public void remove(String customerName) {
        System.out.println(customerName + " is deleted from customer database.");
    }

    public void update(String customerName) {
        System.out.println(customerName + " is updated in database.");
    }
}

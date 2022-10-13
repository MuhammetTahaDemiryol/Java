package Homeworks.Week3.HomeworkTwo.ClassesWithAttributes;

public class ProductManager {

    public void Add(Product product) {

        System.out.println("Product added: " + product.getName());
    }

    // misuse
    public void AddTwo(int id, String name, String description, double price, int stockAmount, String colour) {
        System.out.println("Product added: " + name);
    }

}

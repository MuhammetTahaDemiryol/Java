package Homeworks.Week3.HomeworkTwo.classesWithAttributes;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Desktop", "Gamepower", 10000,1, "Black");
        // product.name = "Laptop";
        // product.id = 1;
        // product.description = "Asus";
        // product.price = 15000;
        // product.stockAmount = 3;

        
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(15000);
        product.setStockAmount(3);



        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        // misuse, when added new feature, it crashes
        // productManager.AddTwo(1, "", "", 12000, 2);
        // productManager.AddTwo(1, "", "", 12000, 2);
        // productManager.AddTwo(1, "", "", 12000, 2);
        // productManager.AddTwo(1, "", "", 12000, 2);

        System.out.println(product.getCode());

    }

}

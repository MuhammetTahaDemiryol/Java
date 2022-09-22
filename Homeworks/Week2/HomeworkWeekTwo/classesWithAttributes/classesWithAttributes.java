package HomeworkWeekTwo.classesWithAttributes;

public class classesWithAttributes {
    public static void main(String[] args) {
        product product = new product(1,"Laptop","Asus Laptop",5000,3,"Black");

      /*Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);*/

        productManager productManager = new productManager();
        productManager.Add(product);
        System.out.println(product.getCode());
    }
}

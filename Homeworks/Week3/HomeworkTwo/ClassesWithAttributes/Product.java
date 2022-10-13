package Homeworks.Week3.HomeworkTwo.ClassesWithAttributes;

public class Product {


    public Product(int id, String name, String description, double price, int stockAmount, String colour) {
        System.out.println("Constructor Initiated");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.colour = colour;
        System.out.println("Product added: " + this.name);
    }

    public Product() {

    }

    // attribute | field
    // default created as public
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String colour;
    
    


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return this.stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCode() {
        return this.name.substring(0,1) + id;
    }

}

    



    

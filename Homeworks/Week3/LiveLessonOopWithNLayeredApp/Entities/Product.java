package Homeworks.Week3.LiveLessonOopWithNLayeredApp.Entities;

public class Product {
    private int id;
    private String name;
    private double unitPrice;

    public Product() {
        super();
    }

    public Product(int id, String name, double unitPrice) {
        super();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }


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

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    

}
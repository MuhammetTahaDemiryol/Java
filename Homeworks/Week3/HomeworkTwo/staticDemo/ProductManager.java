package Homeworks.Week3.HomeworkTwo.staticDemo;

public class ProductManager {
    
    public void Add(Product product){

        

        if(ProductValidator.isValid(product)){
            System.out.println("Product Added.");
        }else{
            System.out.println("Product is not valid.");
        }
        
       
    }

}

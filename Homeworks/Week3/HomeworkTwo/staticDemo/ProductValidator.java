package Homeworks.Week3.HomeworkTwo.staticDemo;

public class ProductValidator {
    
    static{
        System.out.println("Static Constructor Initialized.");
    }
    public ProductValidator() {
        System.out.println("Constructor Initialized.");
    }


    public static boolean isValid(Product product){

        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }

    }



    public void Anything(){

    }
    
}

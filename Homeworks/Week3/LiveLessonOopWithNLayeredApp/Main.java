package Homeworks.Week3.LiveLessonOopWithNLayeredApp;


import Homeworks.Week3.LiveLessonOopWithNLayeredApp.Business.ProductManager;
import Homeworks.Week3.LiveLessonOopWithNLayeredApp.Core.Logging.*;
import Homeworks.Week3.LiveLessonOopWithNLayeredApp.DataAccess.*;
import Homeworks.Week3.LiveLessonOopWithNLayeredApp.Entities.Product;

public class Main{

    public static void main(String[] args) throws Exception {
        
        Product product1 = new Product(1, "Iphone Xr", 10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()}; 

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers );

        productManager.add(product1);

    }

}

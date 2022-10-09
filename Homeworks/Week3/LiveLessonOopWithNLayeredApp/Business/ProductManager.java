package Homeworks.Week3.LiveLessonOopWithNLayeredApp.Business;


import Homeworks.Week3.LiveLessonOopWithNLayeredApp.DataAccess.*;
import Homeworks.Week3.LiveLessonOopWithNLayeredApp.Entities.Product;
import Homeworks.Week3.LiveLessonOopWithNLayeredApp.Core.Logging.Logger;

public class ProductManager {
    
    private ProductDao productDao;
    private Logger[] loggers;


    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;

    }
    


    public void add(Product product) throws Exception {

        if(product.getUnitPrice() < 10){
            throw new Exception("Price can not be smaller than 10");
        }
        
        
        productDao.add(product);

        for(Logger logger: loggers) {
            logger.log(product.getName());

        }
    }

}

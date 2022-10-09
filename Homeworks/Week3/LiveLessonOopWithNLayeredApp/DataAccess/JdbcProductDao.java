package Homeworks.Week3.LiveLessonOopWithNLayeredApp.DataAccess;

import Homeworks.Week3.LiveLessonOopWithNLayeredApp.Entities.Product;
 
//Dao: Data access object 
public class JdbcProductDao  implements ProductDao{
    
    public void add(Product product){
        System.out.println("Added to database with JDBC");
    }

}




package Homeworks.Week3.LiveLessonOopWithNLayeredApp.DataAccess;

import Homeworks.Week3.LiveLessonOopWithNLayeredApp.Entities.Product;

public class HibernateProductDao implements ProductDao {
    
    public void add(Product product){
        System.out.println("Added to database with Hibernate");
    }
}

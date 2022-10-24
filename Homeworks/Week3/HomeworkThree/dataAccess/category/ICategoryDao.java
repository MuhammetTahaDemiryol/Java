package Homeworks.Week3.HomeworkThree.dataAccess.category;

import java.util.List;

import Homeworks.Week3.HomeworkThree.entity.Category;

public interface ICategoryDao {

    void add(Category category);

    void delete(int id);

    void update(int id, Category category);

    Category findById(int id);

    List<Category> getCategories();
    
}

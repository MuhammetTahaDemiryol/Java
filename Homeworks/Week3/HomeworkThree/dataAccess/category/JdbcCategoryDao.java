package Homeworks.Week3.HomeworkThree.dataAccess.category;

import java.util.ArrayList;
import java.util.List;
import Homeworks.Week3.HomeworkThree.entity.Category;

public class JdbcCategoryDao implements ICategoryDao {

    private List<Category> categories = new ArrayList<>();

    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("Category added with : Jdbc.");
    }

    @Override
    public void delete(int id) {
        categories.remove(id);
        System.out.println("Category updated.");
    }

    @Override
    public void update(int id, Category category) {
        categories.set(id, category);
        System.out.println("Category updated.");
    }

    @Override
    public Category findById(int id) {
        // Because list's index starts from 0 we substracted 1.
        return categories.get(id - 1);
    }

    @Override
    public List<Category> getCategories() {
        return categories;
    }

}

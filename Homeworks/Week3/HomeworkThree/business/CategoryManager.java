package Homeworks.Week3.HomeworkThree.business;

import java.util.ArrayList;
import java.util.List;

import Homeworks.Week3.HomeworkThree.dataAccess.category.ICategoryDao;
import Homeworks.Week3.HomeworkThree.entity.Category;
import Homeworks.Week3.HomeworkThree.logger.ILogger;

public class CategoryManager {

    private ICategoryDao categoryDao;
    private List<ILogger> loggers = new ArrayList<>();

    public CategoryManager(ICategoryDao categoryDao, List<ILogger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {

        boolean isRepeat = false;
        for (Category c : categoryDao.getCategories()) {
            if (category.getName().equals(c.getName())) {
                isRepeat = true;
            }

        }
        if (!isRepeat) {
            categoryDao.add(category);
        } else {
            throw new Exception("Category name can not repeat.");
        }

        for (ILogger logger : loggers) {
            logger.log(category.getName());
        }

    }

    public void delete(int id) {
        categoryDao.delete(id);
    }

    public void update(int id, Category category) {
        categoryDao.update(id, category);
    }
    
    public Category findById(int id) {
        return categoryDao.findById(id);
    }

    public List<Category> getCategories() {
        return categoryDao.getCategories();
    }

}

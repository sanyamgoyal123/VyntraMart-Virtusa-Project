package mart.app.onlineback.dao;

import java.util.List;

import mart.app.onlineback.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
}

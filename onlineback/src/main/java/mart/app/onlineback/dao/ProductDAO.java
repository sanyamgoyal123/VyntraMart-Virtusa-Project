package mart.app.onlineback.dao;

import java.util.List;

import mart.app.onlineback.dto.Product;

public interface ProductDAO {
	Product get(int productId);
	List<Product> list();
	
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	List<Product> listActiveProducts();
	List<Product> listActiveProductsById(int categoryId);
	List<Product> getLatestActiveProducts(int count);
	
}

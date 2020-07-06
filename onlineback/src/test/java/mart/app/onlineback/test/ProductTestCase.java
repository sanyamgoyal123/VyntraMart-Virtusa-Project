package mart.app.onlineback.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mart.app.onlineback.dao.ProductDAO;
import mart.app.onlineback.dto.Product;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;
    private static ProductDAO productdao;
	
    private Product product;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("mart.app.onlineback");
		context.refresh();
		productdao = (ProductDAO)context.getBean("productdao");
	}
	
	 @Test
	public void testCRUDProduct() {
		product  = new Product();
		product.setName("Oppo selfie S53");
		product.setBrand("Oppo");
		product.setDescription("description for oppo selfie s53");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(4);
		product.setSupplierId(2);
		assertEquals("something went wrong!",true,productdao.add(product));
		
		product = productdao.get(3);
		assertEquals("something went wrong!",true,productdao.delete(product));
		
		assertEquals("something went wrong!",6,productdao.list().size());
	} 
	
	@Test
	public void testListActiveProducts() {
		assertEquals("something went wrong!",5,productdao.listActiveProducts().size());
	}
	
	@Test
	public void testListActiveProductsByCategory() {
		assertEquals("something went wrong!",2,productdao.listActiveProductsById(1).size());
		assertEquals("something went wrong!",1,productdao.listActiveProductsById(2).size());
		assertEquals("something went wrong!",1,productdao.listActiveProductsById(3).size());
		assertEquals("something went wrong!",1,productdao.listActiveProductsById(4).size());
	}
	
	@Test
	public void testGetLatestActiveProducts() {
		assertEquals("something went wrong!",3,productdao.getLatestActiveProducts(3).size());
	}
	
}

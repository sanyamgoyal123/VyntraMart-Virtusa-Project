package mart.app.onlineback.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mart.app.onlineback.dao.CategoryDAO;
import mart.app.onlineback.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categorydao;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("mart.app.onlineback");
		context.refresh();
		
		categorydao = (CategoryDAO)context.getBean("categorydao");
		
	}
	
	/* @Test
	public void testAddCategory() {
		category = new Category();
		category.setName("Shoes");
		category.setDescription("Description for Shoes");
		category.setImageURL("cat5.png");
		
		assertEquals("Success adding category inside table!",true,categorydao.add(category));
		
	} */
	
	/* @Test
	public void testGetCategory() {
		category = categorydao.get(2);
		assertEquals("Success fetching a single category from table!","T-Shirts",category.getName());
	} */
	/* @Test
	public void testUpdateCategory() {
		category = categorydao.get(2);
		category.setName("Tshirts");
		assertEquals("Success updating a single category in table!",true,categorydao.update(category));
	} */
	/* @Test
	public void testDeleteCategory() {
		category = categorydao.get(2);
		//category.setName("Tshirts");
		assertEquals("Success deleting a single category in table!",true,categorydao.delete(category));
	} */
	/* @Test
	public void testListCategory() {
		//category = categorydao.get(2);
		//category.setName("Tshirts");
		assertEquals("Success fetching a list of category from table!",2,categorydao.list().size());
	} */
	
	
	@Test
	public void testCRUDCategory() {
		
		category = new Category();
		category.setName("Shoes");
		category.setDescription("Description for Shoes");
		category.setImageURL("cat1.png");
		assertEquals("Failed adding category inside table!",true,categorydao.add(category));
		
		category = new Category();
		category.setName("T-shirts");
		category.setDescription("Description for T-shirts");
		category.setImageURL("cat2.png");
		assertEquals("Failed adding category inside table!",true,categorydao.add(category));
		
		category = new Category();
		category.setName("Jeans");
		category.setDescription("Description for Jeans");
		category.setImageURL("cat3.png");
		assertEquals("Failed adding category inside table!",true,categorydao.add(category));
		
		category = categorydao.get(2);
		// assertEquals("Success fetching a single category from table!","Jeans",category.getName());
		assertEquals("Failed deleting a single category in table!",true,categorydao.delete(category));
		
		assertEquals("Failed fetching a list of category from table!",2,categorydao.list().size());
	}	
	
}

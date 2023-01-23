package linkcode.admin.shop.dao;
import java.util.List;
import linkcode.admin.shop.model.Product;

public interface ProductService {
	String createProduct(List<Product>lst);
	List<Product> retriveProduct(int prodId);
	boolean deleteProduct(int prodId);
	List <Product>getAllProduct();
}

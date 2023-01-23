package linkcode.admin.shop.controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import linkcode.admin.shop.dao.ProductService;
import linkcode.admin.shop.dao.impl.ProductServiceImpl;
import linkcode.admin.shop.model.Product;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodId=Integer.parseInt(request.getParameter("prodId"));
		String prodName=request.getParameter("prodName");
		double prodPrice=Double.parseDouble(request.getParameter("prodPrice"));
		int prodQty=Integer.parseInt(request.getParameter("prodQty"));

		Product prod=new Product(prodId, prodName, prodPrice, prodQty);
		List<Product>lst=new ArrayList<Product>();
		lst.add(prod);
		ProductService pimpl=new ProductServiceImpl(); 
		String str=pimpl.createProduct(lst);
		System.out.println("In Controller str is: "+str);

		HttpSession session=request.getSession();
		if(str.equals("valid")) {
			str="Product Added Successfully!!";
		}
		session.setAttribute("msg", str);
		response.sendRedirect("ProductAdd.jsp");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

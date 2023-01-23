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

public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewController() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodId=Integer.parseInt(request.getParameter("prodId"));
		Product prod=null;
		String msg=null;
		List<Product>lst=new ArrayList<Product>();
		ProductService pimpl=new ProductServiceImpl();  
		lst=pimpl.retriveProduct(prodId);
		HttpSession session=request.getSession();
		if(lst!=null) {
			session.setAttribute("prod", lst);}
		else {
			msg="INVALID PRODUCT ID";
			session.setAttribute("prod", msg);
		}
			response.sendRedirect("ProductView.jsp");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

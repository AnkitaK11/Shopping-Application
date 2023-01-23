package linkcode.admin.shop.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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

/**
 * Servlet implementation class DisplayAllController
 */
public class DisplayAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayAllController() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ProductService proddao=new ProductServiceImpl();
		List<Product> lstprod=proddao.getAllProduct();
		if(lstprod!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("prodlst",lstprod);

		}
		response.sendRedirect("DisplayAllView.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

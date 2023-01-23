package linkcode.admin.shop.controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import linkcode.admin.shop.dao.ProductService;
import linkcode.admin.shop.dao.impl.ProductServiceImpl;
import linkcode.admin.shop.model.Delete;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodId=Integer.parseInt(request.getParameter("prodId"));
		Delete prod=new Delete(prodId);
		List<Delete>lst=new ArrayList<Delete>();
		lst.add(prod);
		ProductService pimpl=new ProductServiceImpl(); 
		boolean i=pimpl.deleteProduct(prodId); 
        if  (i==true)
        {
    		response.sendRedirect("Delete.jsp");         
        }
        else
        {
        	response.sendRedirect("Ndelete.jsp");  
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

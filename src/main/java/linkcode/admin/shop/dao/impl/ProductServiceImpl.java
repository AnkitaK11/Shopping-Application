package linkcode.admin.shop.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import linkcode.admin.shop.dao.ProductService;
import linkcode.admin.shop.model.Product;
import linkcode.db.ShopDb;

public class ProductServiceImpl implements ProductService {
	ShopDb dsa=new ShopDb();
	@SuppressWarnings("static-access")
	Connection con=dsa.getConnection();
	int i=0;
	@Override
	public String createProduct(List<Product> lst) {
		String str=null;
		Product p=lst.get(0);
		try {
			PreparedStatement pstate=con.prepareStatement("insert into Product values (?,?,?,?)");
			pstate.setInt(1,p.getProdId());
			pstate.setString(2,p.getProdName());
			pstate.setDouble(3,p.getProdPrice());
			pstate.setInt(4,p.getProdQty());
			i=pstate.executeUpdate();
			if(i>0) {
				str="valid";
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			str=e.getMessage();
			e.printStackTrace();
		}
		return str;
	}


	@Override
	public List<Product> retriveProduct(int prodId) {
		List<Product>lst=null;
		try {
			PreparedStatement pstate=con.prepareStatement("SELECT * FROM Product where prod_Id=?");
			pstate.setInt(1, prodId);
			ResultSet rs=pstate.executeQuery();
			if(rs.next()) {
				lst=new ArrayList<Product>();
				prodId=rs.getInt(1);
				String prodName=rs.getString(2);
				double prodPrice=rs.getDouble(3);
				int prodQty=rs.getInt(4);
				Product ptemp=new Product(prodId, prodName, prodPrice, prodQty);
				lst.add(ptemp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public boolean deleteProduct(int prodId) {
		boolean b=false;
		try {
			PreparedStatement pstate=con.prepareStatement("DELETE FROM product where prod_Id=?");
			pstate.setInt(1,prodId);
			i=pstate.executeUpdate();
			if(i>0) {
				b=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> prodlst=new LinkedList<Product>();
		ShopDb shopdao=new ShopDb();
		Connection con=shopdao.getConnection();
		String str="select * from product";
		try {
			Statement pstate=con.createStatement();
			ResultSet rs=pstate.executeQuery(str);
			prodlst=new ArrayList<Product>();
			while(rs.next()) {
				Product prod=new Product(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4));
				prodlst.add(prod);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prodlst;
	}



}

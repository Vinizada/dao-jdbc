package application;

import java.util.List;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println();
		System.out.println("=== TEST 1: seller findByDepartment ===");
		Department department =  new Department(2, null);
		
		List<Seller> listTeste = sellerDao.findByDepartment(department);
		
		for (Seller obj : listTeste) {
			System.out.println(obj);
		}
		

	}

}




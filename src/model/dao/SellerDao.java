package model.dao;

import java.util.List;

import mode.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteByUd(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	
}

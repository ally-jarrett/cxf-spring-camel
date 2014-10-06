package com.cxf.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cxf.dao.ProductDao;
import com.cxf.model.Product;
import com.cxf.services.ProductService;

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao prodcutDao;

	public Product getProduct(String id) {
		System.out.println("product id=" + id);
		return prodcutDao.getProduct(id);
	}

	public Product saveProduct(Product product) {
		return prodcutDao.saveProduct(product);

	}

}

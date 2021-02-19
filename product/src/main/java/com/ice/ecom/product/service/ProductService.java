package com.ice.ecom.product.service;


import com.ice.ecom.product.domain.Product;

/**
 * @author lucky_ice
 * @version 1.0
 * @created 18-9��-2020 16:44:57
 */
public interface ProductService {

	/**
	 * 
	 * @param product
	 */
	public Product addProduct(Product product);

	/**
	 * 
	 * @param productId
	 */
	public Product getProduct(String productId);

}
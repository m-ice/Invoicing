package com.ice.ecom.product.service;

import com.ice.ecom.product.domain.Product;
import com.ice.ecom.product.repsitory.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getProduct(String productId) {
        return productRepo.findById(productId).orElse(new Product());
    }
}

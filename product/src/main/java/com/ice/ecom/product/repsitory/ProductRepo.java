package com.ice.ecom.product.repsitory;

import com.ice.ecom.product.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public interface ProductRepo extends CrudRepository<Product,String> {

    //"select * from product where"
}

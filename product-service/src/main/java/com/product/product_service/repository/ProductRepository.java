/**
 * aniboys.id
 * Copyright (c) 2017-2024 All Rights Reserved.
 */
package com.product.product_service.repository;

import com.product.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: ProductRepository.java, v 0.1 2024‐08‐08 13:11 Aceng Exp $$
 */
public interface ProductRepository extends MongoRepository<Product, String> {

}
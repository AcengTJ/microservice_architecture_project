/**
 * aniboys.id
 * Copyright (c) 2017-2024 All Rights Reserved.
 */
package com.product.product_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: ProductRequest.java, v 0.1 2024‐08‐08 13:16 Aceng Exp $$
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
 private String name;
 private String description;
 private BigDecimal price;
}

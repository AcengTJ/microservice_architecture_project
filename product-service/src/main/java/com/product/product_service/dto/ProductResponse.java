/**
 * aniboys.id
 * Copyright (c) 2017-2024 All Rights Reserved.
 */
package com.product.product_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: ProductResponse.java, v 0.1 2024‐08‐08 13:27 Aceng Exp $$
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}

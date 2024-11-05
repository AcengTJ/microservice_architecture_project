/**
 * aniboys.id
 * Copyright (c) 2017-2024 All Rights Reserved.
 */
package com.order.order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: OrderRequest.java, v 0.1 2024‐08‐08 16:05 Aceng Exp $$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
 private List<OrderLineItemsDto> orderLineItemsDtoList;
}

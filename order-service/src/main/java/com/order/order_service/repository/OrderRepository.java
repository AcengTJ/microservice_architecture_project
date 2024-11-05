/**
 * aniboys.id
 * Copyright (c) 2017-2024 All Rights Reserved.
 */
package com.order.order_service.repository;

import com.order.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: OrderRepository.java, v 0.1 2024‐08‐08 16:20 Aceng Exp $$
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
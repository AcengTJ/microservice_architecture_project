/**
 * aniboys.id
 * Copyright (c) 2017-2024 All Rights Reserved.
 */
package com.order.order_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: Order.java, v 0.1 2024‐08‐08 15:52 Aceng Exp $$
 */
@Entity
@Table(name = "t_orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String orderNumber;

 @OneToMany(cascade = CascadeType.ALL)
 private List<OrderLineItems> orderLineItemsList;

}

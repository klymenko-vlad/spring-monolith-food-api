package com.klymenko.foodapp.order.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.klymenko.foodapp.auth_users.dtos.UserDTO;
import com.klymenko.foodapp.enums.OrderStatus;
import com.klymenko.foodapp.enums.PaymentStatus;
import com.klymenko.foodapp.menu.dtos.MenuDTO;
import com.klymenko.foodapp.menu.entity.Menu;
import com.klymenko.foodapp.order.entity.Order;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemDTO {
    private Long id;

    private Order order;

    private MenuDTO menu;

    private int quantity;

    private BigDecimal pricePerUnit;
    private BigDecimal subtotal;
}

package com.klymenko.foodapp.payment.dtos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.klymenko.foodapp.auth_users.dtos.UserDTO;
import com.klymenko.foodapp.auth_users.entity.User;
import com.klymenko.foodapp.enums.PaymentGateway;
import com.klymenko.foodapp.enums.PaymentStatus;
import com.klymenko.foodapp.order.dtos.OrderDTO;
import com.klymenko.foodapp.order.entity.Order;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {
    private Long id;

    private Long orderId;

    private BigDecimal amount;

    private PaymentStatus paymentStatus;

    private String transactionId;

    private PaymentGateway paymentGateway;

    private String failureReason;

    private boolean success;

    private LocalDateTime paymentDate;

   private OrderDTO order;

   private UserDTO user;
}

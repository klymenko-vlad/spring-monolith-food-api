package com.klymenko.foodapp.order.repository;

import com.klymenko.foodapp.auth_users.entity.User;
import com.klymenko.foodapp.enums.OrderStatus;
import com.klymenko.foodapp.order.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Page<Order> findOrdersByOrderStatus(OrderStatus orderStatus, Pageable pageable);

    List<Order> findOrdersByOrderDateDesc(User user);

    @Query("SELECT COUNT(DISTINCT Order.user.id) FROM Order")
    long countDistinctByUsers();

}
